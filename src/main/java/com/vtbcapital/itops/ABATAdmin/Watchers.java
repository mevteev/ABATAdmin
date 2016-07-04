package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name = "Watchers")
public class Watchers extends ReferenceType {
	
	private Users user;
	private UserGroups userGroupId;
	
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
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UserGroupId")
	public UserGroups getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(UserGroups groupId) {
		this.userGroupId = groupId;
	}
	
	@ManyToOne()
	@JoinColumn(name = "UserId")
	public Users getUser() {
		return user;
	}

	public void setUser(Users userId) {
		this.user = userId;
	}
	
	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (!(that instanceof JobCompany))
			return false;
		return ((Watchers) that).getUser().equals(this.getUser())
				&& ((Watchers) that).getUserGroupId().equals(this.getUserGroupId());
	}
	
	public static void main(String args[]) {
		
		SessionObjects so = AppSettings.getSessionObjects();
		
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
		
		for (Users user : userList) {
			System.out.println("-------------" + user + "----------------");
			for(Users us : user.getGroupUsers(so)) {
				System.out.println(us);
			}
		}
		
		

	}

}
