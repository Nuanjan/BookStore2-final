package cit285.bookstore2.presentation.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cit285.bookstore2.config.*;
import cit285.bookstore2.domain.*;
import cit285.bookstor2.service.*;

/**
 * Servlet implementation class PaymentsServlet
 */
@WebServlet("/StoreServlet")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerServicesAPI customerServices;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	try{
			//System.out.println("Configuring services...");
			BookStoreSystemConfig.configureServices();
		}
		catch(Exception e){}
		//System.out.println("Getting payments services...");
		customerServices = BookStoreSystemConfig.getCustomerServices();
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		HttpSession session = request.getSession();
		String source = request.getParameter("source");
		
		if (source.equals("admin")){
			//adminpage
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/AdminLogin.jsp").forward(request, response);
		}
		else if(source.equals("customer")) {
			// Create a cart
			//Cart cart = customerServices.createCart();
			
			// Add cart to session
			//session.setAttribute("cart",cart);
			//studentpage
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/CustomerLogin.jsp").forward(request, response);
		}
		else{
			session.setAttribute("Error","Unknown source!");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
		}
	}
}
