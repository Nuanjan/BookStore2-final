package cit285.bookstore2.presentation.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cit285.bookstor2.service.AdminServices;
import cit285.bookstor2.service.AdminServicesAPI;
import cit285.bookstore2.config.BookStoreSystemConfig;
import cit285.bookstore2.domain.BookList;
import cit285.bookstore2.domain.LoginAdmin;


/**
 * Servlet implementation class PaymentsServlet
 */
@WebServlet("/admin/*")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AdminServicesAPI adminServices;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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
		adminServices = BookStoreSystemConfig.getAdminServices();
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: Admin ").append(request.getContextPath());
		

		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
		HttpSession session = request.getSession();
		String source = request.getParameter("source");
		
		System.out.println("source : " + source);
		
		 if(source.equals("addbook")) {
			 getServletContext().getRequestDispatcher("/WEB-INF/jsp/addBook.jsp").forward(request, response);
			BookList book = new BookList();
			//System.out.println("bookID : "+request.getParameter("bookID"));
			
				
			book.setBookID(Integer.parseInt(request.getParameter("bookID")));
			book.setISBN(request.getParameter("ISBN"));
			System.out.println("authorName : "+request.getParameter("authorName"));
			book.setAuthorName(request.getParameter("authorName"));
			book.setYear(Integer.parseInt(request.getParameter("year")));
			System.out.println("publisher : "+request.getParameter("publisher"));
			book.setPublisher(request.getParameter("publisher"));
			System.out.println(" title: "+request.getParameter("title"));
			book.setTitle(request.getParameter("title"));			
			book.setPrice(Double.parseDouble(request.getParameter("price")));
			
			System.out.println("authorNam : "+book.getAuthorName());
			adminServices.registerBook(book);
			
			
		}
		else if(source.equals("updatebook")) {
			// TO DO
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/updateBook.jsp").forward(request, response);
			BookList book = new BookList();
			
			book.setBookID(Integer.parseInt(request.getParameter("bookID")));
			book.setISBN(request.getParameter("ISBN"));
			System.out.println("authorName : "+request.getParameter("authorName"));
			book.setAuthorName(request.getParameter("authorName"));
			book.setYear(Integer.parseInt(request.getParameter("year")));
			System.out.println("publisher : "+request.getParameter("publisher"));
			book.setPublisher(request.getParameter("publisher"));
			System.out.println(" title: "+request.getParameter("title"));
			book.setTitle(request.getParameter("title"));
			book.setPrice(Double.parseDouble(request.getParameter("price")));
			
			
			AdminServices adminServices = new AdminServices();
			adminServices.updateBook(book);
		
			
			
		}
		else if(source.equals("deletebook")) {
			// TO DO
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/deleteBook.jsp").forward(request, response);
			BookList book = new BookList();
			try {
				int i = Integer.parseInt(request.getParameter("bookID"));
				book.setBookID(i);
				AdminServices adminServices = new AdminServices();
				adminServices.deleteBook(book);
				System.out.println("deleted book : "+book);
				
			}catch(NumberFormatException e) {
				e.printStackTrace();
			}
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/bookManager.jsp").forward(request, response);
		}
		else if(source.equals("booklist")) {
		//getServletContext().getRequestDispatcher("/WEB-INF/jsp/bookList.jsp").forward(request, response);
			AdminServices adminServices = new AdminServices();
			ArrayList<BookList> books = null;
			books = adminServices.getBookList();
			//add attribute to the session
			request.setAttribute("booklist", books);
			
		request.getRequestDispatcher("/WEB-INF/jsp/bookList.jsp").forward(request, response);
				
			}
		
		else if(source.equals("bookManager")) {
			// TO DO
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/bookManager.jsp").forward(request, response);
		}else if(source.equals("logout")) {
			
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		else{
			
			session.setAttribute("Error","Unknown source!");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request, response);
		}
	}
	 private void listBook(HttpServletRequest request, HttpServletResponse response)
	            throws SQLException, IOException, ServletException {
		 AdminServices adminServices = new AdminServices();
	        ArrayList<BookList> bookList = adminServices.getBookList();
	        request.setAttribute("listBook", bookList);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("BookList.jsp");
	        dispatcher.forward(request, response);
	    }
}
