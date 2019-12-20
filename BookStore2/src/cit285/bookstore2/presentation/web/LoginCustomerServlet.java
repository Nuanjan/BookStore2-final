package cit285.bookstore2.presentation.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cit285.bookstore2.dao.*;
import cit285.bookstore2.domain.LoginCustomer;
import cit285.bookstor2.service.*;

@WebServlet("/LoginCustomerServlet")
public class LoginCustomerServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
	           throws ServletException, java.io.IOException {

try
{	    

LoginCustomer customer = new LoginCustomer();
customer.setEmail(request.getParameter("email"));
customer.setPassword(request.getParameter("password"));

customer = LoginCustomerServices.getLoginCustomer(customer);
	    
if (customer.isValid())
{
 
HttpSession session = request.getSession(true);	 
ArrayList cart = new ArrayList();
double totalCost = 0;
session.setAttribute("customer",customer);
session.setAttribute("itemlist", cart);
session.setAttribute("total", totalCost);

getServletContext().getRequestDispatcher("/WEB-INF/jsp/customerpage.jsp").forward(request, response);    		
}
 
else 
	getServletContext().getRequestDispatcher("/WEB-INF/jsp/customerRegister.jsp").forward(request, response);
} 


catch (Throwable theException) 	    
{
System.out.println(theException); 
}
}
}
