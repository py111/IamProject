package in.py.iam.dao.impl;

import in.py.iam.dao.IdentityDAO;
import in.py.iam.datamodel.Identity;

import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction; 
import org.hibernate.criterion.Restrictions;
import org.hibernate.Session;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class FileIdentityDAO implements IdentityDAO{
	@Autowired
	SessionFactory sessionFactory;
	private static SessionFactory SessionFactory;

	static {
		try {
			System.out.println("iam in session factory");
			SessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}catch(Throwable ex)
		{
			System.err.println("Initial SessionFactory creation failed");
			throw new ExceptionInInitializerError(ex);
		}
	}	

	public static SessionFactory getSessionFactory() {


		return SessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactory = sessionFactory;
	}

	public FileIdentityDAO()
	{

	}
	@Override
	public void save(Identity identity) {
		Session session = SessionFactory.openSession(); 
		Transaction tx = session.beginTransaction(); 
		session.save(identity); 
		tx.commit(); 
		session.disconnect(); 
		session.close(); 
	}


	@Override
	public void delete(Identity identity) {
		Session session = SessionFactory.openSession(); 
		Transaction tx = session.beginTransaction(); 

		session.delete(identity); 
		tx.commit(); 
		session.disconnect(); 
		session.close(); 


	}


	@Override
	public void update(Identity identity) {
		Session session = SessionFactory.openSession(); 
		Transaction tx = session.beginTransaction(); 

		session.update(identity);
		System.out.println(identity);
		tx.commit(); 
		session.disconnect(); 
		session.close(); 


	}



	@Override
	public List<Identity> search(Identity identity) {
		Session session = SessionFactory.openSession(); 
		Transaction tx = session.beginTransaction();  		 
		Criteria criteria = session.createCriteria(Identity.class); 

		Criterion UserName = Restrictions.eq("UserName", identity.getUserName()); 
		Criterion lastName = Restrictions.eq("lastName", identity.getLastName()); 
		Criterion firstName = Restrictions.eq("firstName", identity.getFirstName());
		Criterion emailid = Restrictions.eq("emailid", identity.getEmailid()); 
		Criterion password = Restrictions.eq("password", identity.getPassword());
		Criterion birthdate = Restrictions.eq("birthdate", identity.getBirthdate());
		Disjunction orSeries = Restrictions.or(UserName, lastName, firstName,emailid,password,birthdate);

		criteria.add(orSeries); 

		List<Identity> identityList = criteria.list(); 

		tx.commit(); 
		session.disconnect(); 
		session.close(); 

		return identityList; 

	}
	@Override
	public List<Identity> getList() {
		Session session = SessionFactory.openSession(); 
		Transaction tx = session.beginTransaction(); 
		List<Identity> identityList = session.createCriteria(Identity.class).list(); 
		tx.commit(); 
		session.disconnect(); 
		session.close(); 
		return identityList; 

	}
	@Override
	public boolean checkUser(Identity identity) {
		boolean userExists = false; 
		Session session = SessionFactory.openSession(); 
		Transaction tx = session.beginTransaction(); 
		Criteria criteria = session.createCriteria(Identity.class); 

		Criterion login = Restrictions.eq("UserName", identity.getUserName()); 
		Criterion password = Restrictions.eq("password", identity.getPassword()); 
		LogicalExpression andEx = Restrictions.and(login, password); 

		criteria.add(andEx); 
		Identity ii = (Identity)criteria.uniqueResult();
		System.out.println(ii);
		if ( (ii) != null) { 

			userExists = true; 
		} 

		tx.commit(); 
		session.disconnect(); 
		session.close(); 

		return userExists; 

	}
}
