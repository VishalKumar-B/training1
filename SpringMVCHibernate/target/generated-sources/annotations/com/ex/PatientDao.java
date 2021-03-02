package com.ex;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class PatientDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public boolean savePatient(PatientBean reister) {
		Session se = sessionFactory.openSession();
		Transaction tx = se.beginTransaction(); 
		se.save(reister);
		tx.commit();
		se.close();
		
		return true;
		
	}
}
