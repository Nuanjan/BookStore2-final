package cit285.bookstore2.presentation.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cit285.bookstor2.service.CustomerServicesAPI;
import cit285.bookstore2.config.BookStoreSystemConfig;
import cit285.bookstore2.domain.BookList;
import cit285.bookstore2.domain.Cart;


/**
 * Servlet implementation class PaymentsServlet
 */
@WebServlet("/customer/*")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerServicesAPI customerServices;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
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
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		HttpSession session = request.getSession();
		String source = request.getParameter("source");
		
		if (source.equals("bookslist")){
			ArrayList<BookList> books = null;
			Cart cart = customerServices.createCart();
			
			books = customerServices.getBooks();
			
			// Add attribute to the session
			session.setAttribute("books",books);
			session.setAttribute("cart", cart);
			
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/showBookList.jsp").forward(request, response);
		}else if(source.equals("logout")) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		//if registertocourse
//		else if(source.equals("add")) {
//			Cart cart = (Cart) session.getAttribute("cart");
//			// TO DO
//			
//		}
		else if(source.equals("logout")) {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else{
			session.setAttribute("Error","Unknown source!");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
		}
	}
}