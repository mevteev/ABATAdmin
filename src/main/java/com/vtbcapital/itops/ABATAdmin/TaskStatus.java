package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "TaskStatus")
public class TaskStatus extends ReferenceType {
	
	
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
	
	@Column(name = "Status")
	public String getStatus() {
		return getValue();
	}	
	
	public void setStatus(String status) {
		setValue(status);
		this.hasChanged = true;
	}
	
	public static String tableName() {
		return "TaskStatus";
	}


}
