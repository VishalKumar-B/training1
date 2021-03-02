package com.kims;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class DoctorDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
public boolean doctorRegister(DoctorBean register) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction(); 
		session.save(register);
		transaction.commit();
		session.close();
		
		return true;
	}
	
	public DoctorBean doctorLogin(String email, String password) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		String sql = "from DoctorBean d where d.email=:x and d.password=:y";
		Query q = session.createQuery(sql);
		q.setParameter("x", email);
		q.setParameter("y", password);
		List li =  q.list();
		if(li!=null)
			return (DoctorBean) li.get(0);
		else
			return null;
	}
	
	public DoctorBean updateDoctorProfile(DoctorBean update) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		DoctorBean db = (DoctorBean) session.merge(update);
		transaction.commit();
		session.close();
		return db;
	}

	public List<AppointmentBean> viewAppointments(String specialisation) {
		Session session = sessionFactory.openSession();
		String sql = "from AppointmentBean a where a.specialist=:x";
		Query query = session.createQuery(sql);
		query.setParameter("x", specialisation);
		List li = query.list();
		return li;
	}

	public boolean acceptAppointment(String name, int id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String sql = "update AppointmentBean a set a.doctorname=:x, a.status=:y where a.aid=:z";
		Query query = session.createQuery(sql);
		query.setParameter("x", name);
		query.setParameter("y", "Accepted");
		query.setParameter("z", id);
		int i = query.executeUpdate();
		transaction.commit();
		if(i>0)
			return true;
		else 
			return false;
	}
}
