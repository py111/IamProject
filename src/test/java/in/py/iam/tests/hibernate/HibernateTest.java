package in.py.iam.tests.hibernate;

import in.py.iam.datamodel.Identity;

import org.hibernate.Session;
import org.hibernate.HibernateException;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="applicationContext.xml")
public class HibernateTest {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Test
	public void testHibernateSetUp()
	{
		Session session = sessionFactory.openSession();
		/*Identity id = (Identity) session.get(Identity.class, 201);
		System.out.println(id);
		session.close();*/
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
		Identity identity = new Identity("Yadav", "Prachi", null, null,null,null);
		session.saveOrUpdate(identity);
		tx.commit();
		}
		catch (HibernateException he) {
            if (tx!=null) tx.rollback();
            throw he;
        }
		session.close();
		
	}
}

