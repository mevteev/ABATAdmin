package com.vtbcapital.itops.ABATAdmin;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Types")
public class Types extends ReferenceType {

	protected Set<Companies> companies = new HashSet<Companies>(0);
	protected Set<Jobs> jobs = new TreeSet<Jobs>();

	private final static String tableName = "Types";

	public Types() {
	}

	public Types(String name, Set<Companies> companies) {
		this.setValue(name);
		this.companies = companies;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TypeId", unique = true, nullable = false)
	public Long getTypeId() {
		return getId();
	}

	public void setTypeId(Long typeId) {
		setId(typeId);
		this.hasChanged = true;
	}

	@Column(name = "TypeName")
	public String getTypeName() {
		return getValue();
	}

	public void setTypeName(String typeName) {
		setValue(typeName);
		this.hasChanged = true;
	}

	@OneToMany(mappedBy = "companyType")
	public Set<Companies> getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set<Companies> companies) {
		this.companies = companies;
	}

	@OneToMany(mappedBy = "jobType", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	public Set<Jobs> getJobs() {
		return this.jobs;
	}

	public void setJobs(Set<Jobs> jobs) {
		this.jobs = jobs;
	}

	public SortedSet<Jobs> jobsSorted() {
		SortedSet<Jobs> set = new TreeSet<Jobs>();
		set.addAll(getJobs());
		return set;
	}

	public static List<Types> getList(SessionObjects so) {

		List<Types> list = null;
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;

		try {
			tx = session.beginTransaction();
			types = session.createQuery("FROM " + tableName
					+ " order by TypeName");
			list = types.list();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}

		return list;
	}
	
	public static String tableName() {
		return "Types";
	}

}
