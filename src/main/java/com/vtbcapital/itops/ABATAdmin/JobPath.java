package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name = "JobPath")
public class JobPath extends ReferenceType {

	private Jobs job;
	private Instances InstanceId;
	protected String Path;

	public JobPath() {
	}

	public JobPath(Jobs job, Instances instance) {
		this.job = job;
		this.InstanceId = instance;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "JobPathId", unique = true, nullable = false)
	public Long getJobPathId() {
		return getId();
	}

	public void setJobPathId(Long jobId) {
		setId(jobId);
		this.hasChanged = true;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jobId")
	public Jobs getJobId() {
		return job;
	}

	public void setJobId(Jobs job) {
		this.job = job;
	}

	@ManyToOne()
	@JoinColumn(name = "InstanceId")
	public Instances getInstanceId() {
		return InstanceId;
	}

	public void setInstanceId(Instances instance) {
		this.InstanceId = instance;
	}

	@Column(name = "Path")
	public String getPath() {
		return Path;
	}

	public void setPath(String Path) {
		this.Path = Path.trim();
		this.hasChanged = true;
	}

	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}

		if (that == null || that.getClass() != this.getClass()) {
			return false;
		}

		return ((JobPath) that).getInstanceId().equals(this.getInstanceId())
				&& ((JobPath) that).getJobId().equals(this.getJobId());
	}
	
	public static String tableName() {
		return "JobPath";
	}
	
	@SuppressWarnings("unchecked")
	public static JobPath getElement(Instances instance, Jobs job) {
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;
		List<JobPath> list = null;

		try {
			tx = session.beginTransaction();
			
			list = session.createCriteria(JobPath.class)
					.add (Restrictions.eq("jobId", job))
					.add (Restrictions.eq("instanceId", instance))
					.list();
			if (list.size() > 0) {
				return list.get(0);
			}


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


}
