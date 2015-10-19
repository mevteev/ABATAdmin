package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
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
import javax.persistence.Table;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name = "Companies")
public class Companies extends ReferenceType {
	

	// private Long companyType;
	private String memo1;
	private String memo2;

	private Types companyType;

	protected Set<JobCompany> jobCompany = new HashSet<JobCompany>(0);

	public Companies() {
		super();
		memo1 = "";
		memo2 = "";
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "CompanyId", unique = true, nullable = false)
	public Long getCompanyId() {
		return getId();
	}

	public void setCompanyId(Long companyId) {
		setId(companyId);
		this.hasChanged = true;
	}

	@Column(name = "CompanyName")
	public String getCompanyName() {
		return getValue();
	}

	public void setCompanyName(String companyName) {
		setValue(companyName);
		this.hasChanged = true;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CompanyType")
	public Types getCompanyType() {
		return companyType;
	}

	public void setCompanyType(Types companyType) {
		this.companyType = companyType;
	}

	@Column(name = "Memo1")
	public String getMemo1() {
		return memo1.trim();
	}

	public void setMemo1(String memo1) {
		this.memo1 = memo1;
	}

	@Column(name = "Memo2")
	public String getMemo2() {
		return memo2.trim();
	}

	public void setMemo2(String memo2) {
		this.memo2 = memo2;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "companyId", cascade = CascadeType.ALL)
	public Set<JobCompany> getJobCompany() {
		return this.jobCompany;
	}

	public void setJobCompany(Set<JobCompany> jobCompany) {
		this.jobCompany = jobCompany;
	}

	public String toString() {
		return getValue();
	}
	
	public static String tableName() {
		return "Companies";
	}
	

}
