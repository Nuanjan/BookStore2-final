package cit285.bookstore2.presentation.web;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletContext;
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
@WebServlet("/cart/*")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerServicesAPI customerServices;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
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
		Cart cart = (Cart)session.getAttribute("cart");
		
		
		
		
		if (source.equals("add")){
			int bookID = 0;
			
			try {
				bookID = Integer.parseInt(request.getParameter("bookID"));
				
			}catch(NumberFormatException nfe) {
				System.out.println("String not pursable to int... ");
			}
			
			BookList book = customerServices.getBook(bookID);
			// Add book to the cart
			
			cart.addBook(book);
			
			
			// Add cart back to the session
			session.setAttribute("cart",cart);
			
			
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/showBookList.jsp").forward(request, response);
			session.setAttribute("book", book);
		}
		else if(source.equals("remove")) {
			int bookID = 0;
			
			try {
				bookID = Integer.parseInt(request.getParameter("bookID"));
				
			}catch(NumberFormatException nfe) {
				System.out.println("String not pursable to int... ");
			}
			
			BookList book = cart.getBookID(bookID);
			
			// remove the book from the cart
			cart.removeBook(book);
	
System.out.println("book  :  "+book);
			// Add cart back to the session
			session.setAttribute("cart",cart);
			
			
			
			
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/showCart.jsp").forward(request, response);
		}
		else if(source.equals("clearBookList")) {
			// remove the course from the cart
			cart.clear();
			
			
			// Add cart back to the session
			session.setAttribute("cart",cart);
			//session.setAttribute("student",student);
			session.removeAttribute("books");
			
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/showBookList.jsp").forward(request, response);
		}else if(source.equals("clearCart")) {
			// remove the course from the cart
			cart.clear();
			
			
			// Add cart back to the session
			session.setAttribute("cart",cart);
			//session.setAttribute("student",student);
			session.removeAttribute("books");
			
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/showCart.jsp").forward(request, response);
		}
		else if(source.equals("showcart")) {
			Set<BookList> bookscart = cart.getBooks();
			// Add cart back to the session
			session.setAttribute("bookscart",bookscart);
			//session.setAttribute("student",student);
			//session.setAttribute("courses",courses);
			
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/showCart.jsp").forward(request, response);
		}else if(source.equals("showBookList")) {
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/showBookList.jsp").forward(request, response);
		}else if(source.equals("logoutMain")) {
			session.invalidate();
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else{
			session.setAttribute("cart",cart);
			session.setAttribute("Error","Unknown source!");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/showBookList.jsp").forward(request, response);
		}	
	}
}
