package com.JoinedInheritence;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class SpringHibernateConfiguration {

	@Bean
	public BasicDataSource basicDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/motivity");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");

		return basicDataSource;
	}

	@Bean
	public SessionFactory sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(basicDataSource());
		localSessionFactoryBean.setAnnotatedClasses(new Class[] {
				Payment.class,
				Cheque.class,
				CreditCard.class
		});
		

		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		props.setProperty("hibernate.hbm2ddl.auto", "create");
		props.setProperty("hibernate.show_sql", "true");

		localSessionFactoryBean.setHibernateProperties(props);
		try {
			localSessionFactoryBean.afterPropertiesSet(); 		// to initialize class properties in Spring beans. The
																// afterPropertiesSet or @PostConstruct is to initialize a
																// particular object instance and not a class
		} catch (IOException e) {
			e.printStackTrace();
		}

		SessionFactory object = localSessionFactoryBean.getObject();
		return object;
	}

	@Bean
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(sessionFactory());
		hibernateTemplate.setCheckWriteOperations(false);
		return hibernateTemplate;
	}
	
	@Bean
	public JoinedInheritence inheritence() {
		JoinedInheritence ji = new JoinedInheritence();
		ji.setHibernateTemplate(hibernateTemplate());
		return ji;
	}
}
