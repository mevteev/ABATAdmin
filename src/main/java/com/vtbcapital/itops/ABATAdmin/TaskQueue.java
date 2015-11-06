package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.criteria.Expression;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name = "TaskQueue")
public class TaskQueue extends ReferenceType {
	
	
	private Instances instance;
	private Jobs job;
	private Companies company;
	private TaskStatus taskStatus;
	
	private Date startDate;
	private Date endDate;
	private String userName;
	private Date timeQueued;
	private Date timeStarted;
	private Date timeFinished;
	private Long batchId;
	private Long exitCode;
	private String exitCodeDescription;
	private String jiraItem;
	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return super.getId();
	}
	
	public void setId(Long id) {
		super.setId(id);
		this.hasChanged = true;
	}
	
	@ManyToOne()
	@JoinColumn(name = "InstanceId")
	public Instances getInstance() {
		return instance;
	}

	public void setInstance(Instances instance) {
		this.instance = instance;
	}

	@ManyToOne()
	@JoinColumn(name = "JobId")
	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}
	
	@ManyToOne()
	@JoinColumn(name = "CompanyId")
	public Companies getCompany() {
		return company;
	}

	public void setCompany(Companies company) {
		this.company = company;
	}
	
	@ManyToOne()
	@JoinColumn(name = "StatusId")
	public TaskStatus getStatus() {
		return taskStatus;
	}

	public void setStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	@Column(name = "StartDate")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "EndDate")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "UserName")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "TimeQueued")
	public Date getTimeQueued() {
		return timeQueued;
	}

	public void setTimeQueued(Date timeQueued) {
		this.timeQueued = timeQueued;
	}

	@Column(name = "TimeStarted")
	public Date getTimeStarted() {
		return timeStarted;
	}

	public void setTimeStarted(Date timeStarted) {
		this.timeStarted = timeStarted;
	}

	@Column(name = "TimeFinished")
	public Date getTimeFinished() {
		return timeFinished;
	}

	public void setTimeFinished(Date timeFinished) {
		this.timeFinished = timeFinished;
	}

	@Column(name = "BatchId")
	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}

	@Column(name = "ExitCode")
	public Long getExitCode() {
		return exitCode;
	}

	public void setExitCode(Long exitCode) {
		this.exitCode = exitCode;
	}
	
	@Column(name = "ExitCodeDescription")
	public String getExitCodeDescription() {
		return exitCodeDescription;
	}

	public void setExitCodeDescription(String exitCodeDescription) {
		this.exitCodeDescription = exitCodeDescription;
	}

	@Column(name = "JiraItem")
	public String getJiraItem() {
		return jiraItem.trim();
	}

	public void setJiraItem(String jiraItem) {
		this.jiraItem = jiraItem;
	}
	
	public void add() {
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(this);
		tx.commit();
	}
	
	public static int countQueuedSubTasks(String jiraItem, Instances inst)  {
		TaskStatus tsQueued = (TaskStatus) ReferenceType.getElement("Queued", TaskStatus.tableName());
		TaskStatus tsInProgress = (TaskStatus) ReferenceType.getElement("In Progress", TaskStatus.tableName());
		Collection<TaskStatus> statuses = new ArrayList<TaskStatus>();
		
		statuses.add(tsQueued);
		statuses.add(tsInProgress);
		
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			
	
			return ((Number) session.createCriteria(TaskQueue.class)
					.add (Restrictions.eq("jiraItem", jiraItem))
					.add (Restrictions.in("status", statuses))
					.add (Restrictions.eq("instance", inst))
					.add (Restrictions.lt("timeQueued", new Date()))     // Added 26082015
					.setProjection(Projections.rowCount()).uniqueResult()).intValue();


		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		
		return -1;

		
	}
	
	@SuppressWarnings("unchecked")
	public static List<TaskQueue> getTasksByStatus(Instances inst, String status) {
		TaskStatus ts = (TaskStatus) ReferenceType.getElement(status, TaskStatus.tableName());
		
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			
	
			return (List<TaskQueue>) session.createCriteria(TaskQueue.class)
					.add (Restrictions.eq("status", ts))
					.add (Restrictions.eq("instance", inst))
					.add(Restrictions.le("timeQueued", new Date()))     // Added 26082015
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					.addOrder(Order.asc("timeQueued"))
					.list();



		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		
		return null;
	}
	
	//property = "company" or "job"
	@SuppressWarnings("unchecked")
	public static List<ReferenceType> getInProgressEntityList(Instances inst, String property) {
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		
		TaskStatus tsInProgress = (TaskStatus) ReferenceType.getElement("In Progress", TaskStatus.tableName());

		try {
			tx = session.beginTransaction();
			
	
			return (List<ReferenceType>) session.createCriteria(TaskQueue.class)
					.add (Restrictions.eq("status", tsInProgress))
					.add (Restrictions.eq("instance", inst))
					.add(Restrictions.le("timeQueued", new Date()))     // Added 26082015
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					.setProjection(Projections.property(property))
					.list();



		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		
		return null;
		
	}
	
	@Transient
	public boolean isCompanyAlreadyInProgress() {
		List<ReferenceType> lst = getInProgressEntityList(getInstance(), "company");
		return lst.contains(getCompany());
	}
	
	@Transient
	public boolean isJobAlreadyInProgress() {
		List<ReferenceType> lst = getInProgressEntityList(getInstance(), "job");
		return lst.contains(getJob());
	}
	
	public static List<TaskQueue> getQueuedTasks(Instances inst) {
		return getTasksByStatus(inst, "Queued"); 
	}
	
	public static List<TaskQueue> getInProgressTasks(Instances inst) {
		return getTasksByStatus(inst, "In Progress");
	}

	
	public static int countInProgressTasks(Instances inst) {
		TaskStatus tsInProgress = (TaskStatus) ReferenceType.getElement("In Progress", TaskStatus.tableName());
		
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			
	
			return ((Number) session.createCriteria(TaskQueue.class)
					.add (Restrictions.eq("status", tsInProgress))
					.add (Restrictions.eq("instance", inst))
					.setProjection(Projections.rowCount()).uniqueResult()).intValue();


		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		return -1;
	}
	
	@SuppressWarnings("unchecked")
	public static List<TaskQueue> getCompanyList(Instances inst, String jiraItem) {
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
	
			return (List<TaskQueue>) session.createCriteria(TaskQueue.class)
					.add (Restrictions.eq("instance", inst))
					.add (Restrictions.eq("jiraItem", jiraItem))
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY)
					//.setProjection(Projections.property("company"))
					.list();



		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		Instances inst = (Instances) ReferenceType.getElement("Production", Instances.tableName());
		//Instances inst = (Instances) ReferenceType.getElement("UAT", Instances.tableName());
		
		List<TaskQueue> lst = getCompanyList(inst, "NMC-744");
		
		Integer maxLen = 0;
		for(TaskQueue cmp : lst) {
			Integer len = cmp.getCompany().toString().length();
			if (len > maxLen) {
				maxLen = len;
			}
		}
		
		for(TaskQueue cmp : lst) {
			System.out.println( String.format("%-"+maxLen.toString()+"s", cmp.getCompany()) + " - " + cmp.getStatus() );
			//System.out.println( isCompanyAlreadyInProgress(inst, (Companies) cmp) );
			
		}
	}
	
}
