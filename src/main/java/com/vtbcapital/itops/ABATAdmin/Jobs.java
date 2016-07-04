package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name = "Jobs")
public class Jobs extends ReferenceType {

	private Types jobType;

	protected Set<JobCompany> jobCompany = new HashSet<JobCompany>(0);

	protected Collection<JobPath> JobPath = new HashSet<JobPath>(0);
	
	private String param1;
	private String param2;
	
	private boolean parallel;
	
	private boolean monopoly;

	// protected String ABPath;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "JobId", unique = true, nullable = false)
	public Long getJobId() {
		return getId();
	}

	public void setJobId(Long jobId) {
		setId(jobId);
		this.hasChanged = true;
	}

	@Column(name = "JobName")
	public String getJobName() {
		return getValue();
	}

	public void setJobName(String jobName) {
		setValue(jobName);
		this.hasChanged = true;
	}

	@ManyToOne()
	@JoinColumn(name = "JobType")
	public Types getJobType() {
		return jobType;
	}

	public void setJobType(Types jobType) {
		this.jobType = jobType;
	}

	@OneToMany(mappedBy = "jobId")
	public Set<JobCompany> getJobCompany() {
		return this.jobCompany;
	}

	public void setJobCompany(Set<JobCompany> jobCompany) {
		this.jobCompany = jobCompany;
	}

	@OneToMany(mappedBy = "jobId", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	public Collection<JobPath> getJobPath() {
		return this.JobPath;
	}

	public JobPath getJobPath(Instances inst) {
		for (JobPath jp : this.JobPath) {
			if (jp.getInstanceId().equals(inst)) {
				return jp;
			}
		}
		return null;
	}
	
	
	public void setJobPath(Collection<JobPath> jobPath) {
		this.JobPath = jobPath;
		// for (JobPath jp : this.JobPath) {
		// if (!jp.getInstanceId().equals(AppSettings.getActiveInstance())) {
		// this.JobPath.remove(jp);
		// }
		// }

	}

	public void setJobPath(String Path) {
		for (JobPath jp : this.JobPath) {

		}

		JobPath jp = new JobPath();
		jp.setInstanceId(AppSettings.getActiveInstance());
		jp.setJobId(this);
		jp.setPath(Path);

		System.out.println(this.getJobPath().size());

		this.getJobPath().clear();

		this.getJobPath().add(jp);

	}
	
	@Column(name = "Param1")
	public String getParam1() {
		if (param1 == null) {
			param1 = "";
		}
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	@Column(name = "Param2")
	public String getParam2() {
		if (param2 == null) {
			param2 = "";
		}		
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}
	
	@Column(name = "Parallel")
	public boolean isParallel() {
		return parallel;
	}

	public void setParallel(boolean parallel) {
		this.parallel = parallel;
	}
	
	
	@Column(name = "Monopoly")
	public boolean isMonopoly() {
		return monopoly;
	}

	public void setMonopoly(boolean monopoly) {
		this.monopoly = monopoly;
	}
	
	public static String tableName() {
		return "Jobs";
	}




}
