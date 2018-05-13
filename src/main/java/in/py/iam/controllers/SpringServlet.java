package in.py.iam.controllers;

//import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import in.py.iam.dao.impl.FileIdentityDAO;
import in.py.iam.datamodel.Identity;
import javax.servlet.ServletConfig;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.beans.factory.config.AutowireCapableBeanFactory; 
import org.springframework.web.context.WebApplicationContext; 
import org.springframework.web.context.support.WebApplicationContextUtils; 

@WebServlet("/SpringServlet")
public class SpringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private WebApplicationContext springContext;
       
	@Autowired 
	protected 
	FileIdentityDAO identityDao; 
	 
	@Autowired 
	@Qualifier("fakeId") 
	protected 
	Identity identity; 

    public SpringServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        springContext = WebApplicationContextUtils.getRequiredWebApplicationContext(config.getServletContext()); 
        final AutowireCapableBeanFactory beanFactory = springContext.getAutowireCapableBeanFactory(); 
        beanFactory.autowireBean(this); 

      }
    
	
}
