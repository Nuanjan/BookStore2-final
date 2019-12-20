package cit285.bookstore2.presentation.web;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cit285.bookstor2.service.LoginAdminServices;
import cit285.bookstore2.dao.*;
import cit285.bookstore2.domain.LoginAdmin;

@WebServlet("/LoginAdminServlet")
public class LoginAdminServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	           throws ServletException, java.io.IOException {

try
{	    

LoginAdmin admin = new LoginAdmin();
admin.setEmail(request.getParameter("email"));
admin.setPassword(request.getParameter("password"));

admin = LoginAdminServices.getLoginAdmin(admin);
	    
if (admin.isValid())
{
 
HttpSession session = request.getSession(true);	    
session.setAttribute("currentSessionUser",admin); 
getServletContext().getRequestDispatcher("/WEB-INF/jsp/bookManager.jsp").forward(request, response); 		
}
 
else 
	getServletContext().getRequestDispatcher("/WEB-INF/jsp/adminRegister.jsp").forward(request, response);
} 


catch (Throwable theException) 	    
{
System.out.println(theException); 
}
}
}
