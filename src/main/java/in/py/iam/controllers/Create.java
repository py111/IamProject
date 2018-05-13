package in.py.iam.controllers;


import in.py.iam.dao.impl.FileIdentityDAO;
import in.py.iam.datamodel.Identity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Create")
public class Create extends SpringServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Create() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("UserName"); 
		String lastName = request.getParameter("lastName"); 
		String firstName = request.getParameter("firstName");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		String birthdate = request.getParameter("birthdate");
		
		Identity identity1 = new Identity();
		FileIdentityDAO identityDao = new FileIdentityDAO();

		identity1.setUserName(userName); 
		identity1.setLastName(lastName);
		identity1.setFirstName(firstName);
		identity1.setEmailid(emailid);
		identity1.setPassword(password); 
		identity1.setBirthdate(birthdate);

		identityDao.save(identity1); 
		request.getRequestDispatcher("/Modify.jsp").forward(request, response); 
	} 


}
