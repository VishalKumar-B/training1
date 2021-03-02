package com.motivity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class HibernateConfiguration {

	@Autowired
	private EntityManager entityManager;
	
	@Bean
	@Primary
	public Session getSession()	{
		return entityManager.unwrap(Session.class);
	}
}
