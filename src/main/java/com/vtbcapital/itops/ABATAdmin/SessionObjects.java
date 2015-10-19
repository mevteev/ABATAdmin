package com.vtbcapital.itops.ABATAdmin;

import java.util.logging.Level;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionObjects {
	private SessionFactory factory;

	public SessionObjects() {
		try {
			
			Configuration conf = new Configuration();
			conf.configure();
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).
					build();
			
			setFactory(conf.buildSessionFactory(serviceRegistry));
			
		} catch (Throwable ex) {
			//AppSettings.getLog().log(Level.SEVERE, "Failed to create sessionFactory object." + ex);
			System.err.println(ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public SessionFactory getFactory() {
		return factory;
	}

	private void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
