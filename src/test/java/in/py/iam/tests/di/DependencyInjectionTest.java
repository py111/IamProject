package in.py.iam.tests.di;

//import in.py.iam.dao.IdentityDAO;
import in.py.iam.datamodel.Identity;

import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="applicationContext.xml")
public class DependencyInjectionTest {
	
	/*@Autowired
	IdentityDAO dao;*/

	@Autowired
	@Qualifier("fakeIdentity2")
	Identity identity2;
	
	@Test
	public void testDI()
	{
		//dao.getByID(0);
		System.out.println(identity2.getFirstName());
		System.out.println(identity2.getLastName());
		//System.out.println(identity2);
	}
}
