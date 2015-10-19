package com.vtbcapital.itops.ABATAdmin;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import asci.activebatch.enumInstanceState;

public class ActiveJob {

	private String name;
	private Jobs job;
	private int id;
	private enumInstanceState state;
	private Date executionTime;
	private int exitCode;
	private String exitCodeDescription;
	private String parameters;
	private String user;
	private int level; // 0 - root
	private String company;
	private Date startDate;
	private Date endDate;

	private List<ActiveJob> children;

	public ActiveJob() {
		children = Collections.emptyList();
	}

	public ActiveJob(String name, int level) {
		this.setName(name);
		this.setLevel(level);
		children = Collections.emptyList();

	}

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
	}

	public enumInstanceState getState() {
		return state;
	}

	public void setState(enumInstanceState state) {
		this.state = state;
	}

	public Date getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}

	public int getExitCode() {
		return exitCode;
	}

	public void setExitCode(int i) {
		this.exitCode = i;
	}

	public String getExitCodeDescription() {
		return exitCodeDescription;
	}

	public void setExitCodeDescription(String exitCodeDescription) {
		this.exitCodeDescription = exitCodeDescription;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ActiveJob> getChildren() {
		return children;
	}

	public void setChildren(List<ActiveJob> children) {
		this.children = children;
	}

	public String toString() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	public boolean equals(Object that) {
		if (this == that) 
			return true;
		if (that == null)
			return false;
		if (getClass() != that.getClass())
			return false;
		if (this.getId() == ((ActiveJob) that).getId())
			return true;
		
		return false;
	}

}
