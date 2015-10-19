package com.vtbcapital.itops.ABATAdmin;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name = "Config")
public class Config extends ReferenceType {
	private String configValue;
	
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return super.getId();
	}
	

	
	@Column(name = "Name")
	public String getName() {
		return super.getValue();
	}
	
	public void setName(String name) {
		super.setValue(name);
	}
	
	@Column(name = "Value")
	public String getConfigValue() {
		return configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
		this.hasChanged = true;
	}

	public static String tableName() {
		return "Config";
	}
	
	public static String getValue(String name) {
		Config cf = (Config) ReferenceType.getElement(name, Config.tableName());
		if (cf == null) return null;
		
		return cf.getConfigValue().trim();
		
	}
	
	public static void setValue(String name, String value) {
		Config cf = (Config) ReferenceType.getElement(name, Config.tableName());
		if (cf == null) {
			cf = new Config();
			cf.setName(name);
		}
		cf.setConfigValue(value);

		SessionObjects so = new SessionObjects();
		Session session = so.getFactory().openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(cf);
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
}
