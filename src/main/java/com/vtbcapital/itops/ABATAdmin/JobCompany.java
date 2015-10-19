package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JobCompany")
public class JobCompany extends ReferenceType {
	private Jobs jobId;
	private Companies companyId;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public Long getId() {
		return super.getId();
	}

	public void setId(Long id) {
		super.setId(id);
		this.hasChanged = true;
	}

	@ManyToOne()
	@JoinColumn(name = "JobId")
	public Jobs getJobId() {
		return jobId;
	}

	public void setJobId(Jobs jobId) {
		this.jobId = jobId;
	}

	@ManyToOne()
	@JoinColumn(name = "CompanyId")
	public Companies getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Companies companyId) {
		this.companyId = companyId;
	}

	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (!(that instanceof JobCompany))
			return false;
		return ((JobCompany) that).getCompanyId().equals(this.getCompanyId())
				&& ((JobCompany) that).getJobId().equals(this.getJobId());
	}

}
