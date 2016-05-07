package com.muahmed.epos.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.muahmed.epos.model.User;

@Repository
public class UserDAOImpl {

	//private HibernateTemplate hibernateTemplate;
	
	//@Autowired
	private SessionFactory sessionFactory;
	
	public int getUserCount() {
		String hql = "select count(*) from User";
		Query query = getSessionFactory().openSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	/*public void setSessionFactory(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}*/

}
