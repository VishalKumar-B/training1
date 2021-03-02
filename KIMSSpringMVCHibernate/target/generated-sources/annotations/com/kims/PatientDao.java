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
public class PatientDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public boolean patientRegister(PatientBean register) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(register);
		transaction.commit();
		session.close();

		return true;
	}

	public PatientBean patientLogin(String email, String password) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		String sql = "from PatientBean p where p.email=:x and p.password=:y";
		Query q = session.createQuery(sql);
		q.setParameter("x", email);
		q.setParameter("y", password);
		List li = q.list();
		session.close();
		if (li != null)
			return (PatientBean) li.get(0);
		else
			return null;
	}

	public PatientBean updatePatientProfile(PatientBean update) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		PatientBean pb = (PatientBean) session.merge(update);
		transaction.commit();
		session.close();
		return pb;
	}

	public boolean applyAppointment(AppointmentBean appointment) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(appointment);
		transaction.commit();
		session.close();
		return true;
	}

	public List<AppointmentBean> appointmentStatus(PatientBean patient) {
		Session session = sessionFactory.openSession();
		String sql = "from AppointmentBean a where a.patient = :x";
		Query query = session.createQuery(sql);
		query.setParameter("x", patient);
		List list = query.list();
		return list;
	}

}
