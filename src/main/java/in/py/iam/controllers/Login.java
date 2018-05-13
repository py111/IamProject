package in.py.iam.controllers;

import in.py.iam.controllers.SpringServlet;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import in.py.iam.datamodel.Identity;
import in.py.iam.dao.impl.FileIdentityDAO;

@WebServlet("/Login")
public class Login extends SpringServlet{

	private static final long serialVersionUID = 1L;  

	public Login() { 
		super(); 
		// TODO Auto-generated constructor stub 
	} 


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
	IOException { 
		doPost(request, response); 
	} 

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, 
	IOException { 
		String login = request.getParameter("UserName"); 
		String password = request.getParameter("password"); 
		String message = "";
		String url = "";
		if (login == "" || password == "") 
		{		

		}
		else{ 
			System.out.println("authenticating with " + login + " and " + password); 

			Identity identity1 = new Identity();
			FileIdentityDAO identityDao = new FileIdentityDAO();
			identity1.setPassword(password); 
			identity1.setUserName(login); 


			if ( (!identityDao.checkUser(identity1))) {
				message = "No such user Name or password exists.<br>"
						+ "Re Login again.";
				url = "/index.jsp";
				request.getRequestDispatcher("/LoginFail.jsp").forward(request, response);
			} else {
				message = "The userID and password are correct !!";
				url = "/Modify.jsp?userName=" + login;
				request.getRequestDispatcher("/Modify.jsp").forward(request, response);
			}
			request.setAttribute("login", login);
			request.setAttribute("message", message);
		} 
		
	} 
} 

