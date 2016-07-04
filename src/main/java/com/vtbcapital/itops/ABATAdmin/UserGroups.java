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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name = "UserGroups")
public class UserGroups extends ReferenceType {
	
	protected Set<Watchers> watchers = new HashSet<Watchers>(0);
	
	private final static String tableName = "UserGroups";
	
	
	public UserGroups() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "UserGroupId", unique = true, nullable = false)
	public Long getUserGroupId() {
		return getId();
	}
	

	public void setUserGroupId(Long usergroupId) {
		setId(usergroupId);
		this.hasChanged = true;
	}
	
	@Column(name = "GroupName")
	public String getGroupName() {
		return getValue();
	}

	public void setGroupName(String groupName) {
		setValue(groupName);
		this.hasChanged = true;
	}	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="UserGroupId",referencedColumnName="UserGroupId")
	public Set<Watchers> getWatchers() {
		return this.watchers;
	}

	public void setWatchers(Set<Watchers> watchers) {
		this.watchers = watchers;
	}
	
	public static String tableName() {
		return "UserGroups";
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Users> getGroupUsers(SessionObjects so) {
		
		List<Users> users = new ArrayList<Users>(); 
		
		List<Watchers> watchers = getWatchers2(so);
		for (Watchers watcher : watchers) {
			users.add(watcher.getUser());
			
		}
		
		return users;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Users> getNoGroupUsers(SessionObjects so) {
		
		List<Watchers> watchers = getWatchers2(so);
		List<Users> groupUsers = getGroupUsers(so);
		
		//Get all users
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		Query usersQry = null;
		
		List<Users> userList = null;
		
		try {
			tx = session.beginTransaction();
			usersQry = session.createQuery("FROM Users");
			userList = usersQry.list();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		
		//Remove group users
		for (Users grUser : groupUsers) {
			userList.remove(grUser);
		}
		
		
		
		return userList;
		
	}
	
	public List<Watchers> getWatchers2(SessionObjects so) {
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		//Query usersQry = null;
		
		List<Watchers> userList = null;
		
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(Watchers.class);
			criteria.add(Restrictions.eqOrIsNull("userGroupId", this));
			//usersQry = session.createQuery("FROM Watchers");
			userList = criteria.list();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		
		return userList;
		
	}
	
	



}
