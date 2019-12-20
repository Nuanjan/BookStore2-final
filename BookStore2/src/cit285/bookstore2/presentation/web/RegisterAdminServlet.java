package cit285.bookstore2.presentation.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import cit285.bookstore2.domain.RegisterAdmin;

import cit285.bookstor2.service.RegisterAdminServices;
import cit285.bookstore2.dao.RegisterAdminDao;;


@WebServlet("/RegisterAdminServlet")
public class RegisterAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private RegisterAdminServices registerAdminServices;
	private RegisterAdminDao registerAdminDao;
String fName,lName,eM,pWord,cfPass,ad1,ad2,ste,ci,sta;
int zip;
	
	

	/**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterAdminServlet() {
        super();
        
        
        
        // TODO Auto-generated constructor stub
    }
   
    public static void main(String[]args) {
    	
    }
    
    public void init() throws ServletException {
    	try{
			//System.out.println("Configuring services...");
    		registerAdminDao = new RegisterAdminDao();
    		
		}
		catch(Exception e){}
		
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
			
			
			
			
			//
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		
		String fname= request.getParameter("firstname");
		String lname= request.getParameter("lastname");
		String eM= request.getParameter("email");
		String pWord= request.getParameter("password");
		String cfPass= request.getParameter("confirmPassword");
		String ad1= request.getParameter("address1");
		String ad2= request.getParameter("address2");
		String ste= request.getParameter("street");
		String ci= request.getParameter("city");
		String sta= request.getParameter("state");
		int zip= Integer.parseInt(request.getParameter("zipcode"));
		String register = request.getParameter("register");
		
		
		RegisterAdmin registerUser = new RegisterAdmin();
		registerUser.setFirstName(fname);
		registerUser.setLastName(lname);
		registerUser.setEmail(eM);
		registerUser.setPassword(pWord);
		registerUser.setConfirmPass(cfPass);
		registerUser.setAddress1(ad1);
		registerUser.setAddress2(ad2);
		registerUser.setStreet(ste);
		registerUser.setCity(ci);
		registerUser.setState(sta);
		registerUser.setZipcode(zip);
		
		
	
			
		//getServletContext().getRequestDispatcher("/WEB-INF/jsp/BookList.jsp").forward(request, response);
		
		 try {
	          registerAdminDao.registerAdmins(registerUser);
	          System.out.print("regisService in Servlet......."+registerUser.getFirstName());
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

		 getServletContext().getRequestDispatcher("/WEB-INF/jsp/bookManager.jsp").forward(request, response);
	    }
	}