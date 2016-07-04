package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name = "Users")
public class Users extends ReferenceType {
	
	protected Set<Watchers> watchers = new HashSet<Watchers>(0);
	
	private final static String tableName = "Users";
	
	
	public Users() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "UserId", unique = true, nullable = false)
	public Long getUserId() {
		return getId();
	}
	

	public void setUserId(Long userId) {
		setId(userId);
		this.hasChanged = true;
	}
	
	@Column(name = "UserName")
	public String getUserName() {
		return getValue();
	}

	public void setUserName(String userName) {
		setValue(userName);
		this.hasChanged = true;
	}	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="UserId",referencedColumnName="UserId")
	public Set<Watchers> getWatchers() {
		return this.watchers;
	}

	public void setWatchers(Set<Watchers> watchers) {
		this.watchers = watchers;
	}
	
	public static String tableName() {
		return "Users";
	}
	
	public List<Watchers> getWatchers2(SessionObjects so) {
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		//Query usersQry = null;
		
		List<Watchers> userList = null;
		
		try {
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(Watchers.class);
			criteria.add(Restrictions.eqOrIsNull("user", this));
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
	
	public Set<Users> getGroupUsers(SessionObjects so) {
		Set<Users> userList = new TreeSet<Users>();
		
		List<Watchers> watchers = getWatchers2(so);
		for (Watchers watcher : watchers) {
			userList.addAll(watcher.getUserGroupId().getGroupUsers(so));
		}
		
		return userList;
		
	}
	

}
