package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name = "Instances")
public class Instances extends ReferenceType {

	protected Set<JobPath> jobPath = new HashSet<JobPath>(0);

	private String instanceHost;

	public Instances() {
		super();
		setInstanceHost("");
	}

	public Instances(String name) {
		super();
		setInstanceName(name);
		setInstanceHost("");
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "InstanceId", unique = true, nullable = false)
	public Long getInstanceId() {
		return getId();
	}

	public void setInstanceId(Long instanceId) {
		setId(instanceId);
		this.hasChanged = true;
	}

	@Column(name = "InstanceName")
	public String getInstanceName() {
		return getValue();
	}

	public void setInstanceName(String instanceName) {
		setValue(instanceName);
		this.hasChanged = true;
	}

	@Column(name = "InstanceHost")
	public String getInstanceHost() {
		return instanceHost;
	}

	public void setInstanceHost(String instanceHost) {
		this.instanceHost = instanceHost;
		this.hasChanged = true;
	}

	@OneToMany(mappedBy = "instanceId")
	public Set<JobPath> getJobPath() {
		return this.jobPath;
	}

	public void setJobPath(Set<JobPath> jobPath) {
		this.jobPath = jobPath;
	}

	public String toString() {
		return getInstanceName();
	}

	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}

		if (that == null || that.getClass() != this.getClass()) {
			return false;
		}

		return ((Instances) that).getInstanceName().equals(
				this.getInstanceName());
	}

	public static List<Instances> getList(SessionObjects so) {

		Session session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;

		List<Instances> instList = null;

		try {
			tx = session.beginTransaction();
			types = session.createQuery("FROM Instances");
			instList = types.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		return instList;

	}
	
	public static String tableName() {
		return "Instances";
	}

}
