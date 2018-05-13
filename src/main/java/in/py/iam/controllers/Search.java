package in.py.iam.controllers;

import in.py.iam.dao.impl.FileIdentityDAO;
import in.py.iam.datamodel.Identity;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String username = request.getParameter("UserName"); 
		String lastname = request.getParameter("lastName");
		String emailid = request.getParameter("email");
		Identity identity1 = new Identity();
		FileIdentityDAO identityDao = new FileIdentityDAO();
		
		identity1.setUserName(username);
		identity1.setLastName(lastname);
		identity1.setEmailid(emailid);
				 		 
		 		List<Identity> identityList = (List<Identity>)identityDao.search(identity1); 
		 		 
		 		request.getSession().setAttribute("identityList", identityList); 
				response.sendRedirect("searchgetList.jsp"); 

	}

}
