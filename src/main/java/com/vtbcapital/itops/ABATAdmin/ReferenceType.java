package com.vtbcapital.itops.ABATAdmin;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReferenceType implements Comparable<ReferenceType> {
	private Long id;
	private String value;
	
	protected boolean hasChanged = false;

	public ReferenceType() {
		value = "";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long typeId) {
		this.id = typeId;
		this.hasChanged = true;
	}

	public String getValue() {
		return value.trim();
	}

	public void setValue(String typeName) {
		this.value = typeName.trim();
		this.hasChanged = true;
	}

	public boolean hasChanged() {
		return hasChanged;
	}

	public String toString() {
		return getValue();
	}

	public boolean equals(Object that) {
		if (this == that)
			return true;
		if (that == null)
			return false;
		if (!(that instanceof ReferenceType))
			return false;
		return ((ReferenceType) that).getId().equals(this.getId());
	}

	@Override
	public int compareTo(ReferenceType that) {
		return this.value.compareTo(that.value);
	}
	
	public void saveElement() {
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(this);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		
	}
	
	
	public static ReferenceType getElement(String value, String tableName) {
		SessionObjects so = AppSettings.getSessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;
		Query types = null;
		List<ReferenceType> list = null;

		try {
			tx = session.beginTransaction();
			types = session.createQuery("FROM " + tableName);
			list = types.list();
			tx.commit();

		} catch (HibernateException e) {
			if (tx != null) {
				tx.rollback();
				e.printStackTrace();
			}
		} finally {
			session.close();
		}
		
		for (ReferenceType c : list) {
			if (c.getValue().equals(value)) {
				return c;
			}
		}
		return null;

	}
	
}
