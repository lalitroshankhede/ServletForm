package com.person_register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
		/* Generate Response for the Client Request */
		
         		response.setContentType("text/html");
		
         		PrintWriter printWriter=response.getWriter();
         		
         		printWriter.println("<h2> Welcome to Register Servlet </h2> ");
         		
            
				/*
				 * fetching the data from the requested client side and store into the container
				 */
         		
         		
         		String name=request.getParameter("username");
         		String pass=request.getParameter("password");
         		String emailid=request.getParameter("email");
         		String gen=request.getParameter("gender");
         		String course=request.getParameter("skills");
         		
         		String condi=request.getParameter("agree");
         		
         		 if (condi!=null) {
					
         		
         		if (condi.equals("agree")) {
					
         			printWriter.println("<h2> Name : "+name+"</h2>");
         			printWriter.println("<h2> Password : "+pass+"</h2>");
         			printWriter.println("<h2> Email : "+emailid+"</h2>");
         			printWriter.println("<h2> Gender : "+gen+"</h2>");
         			printWriter.println("<h2> Course : "+course+"</h2>");
         			
         			
         			RequestDispatcher requestDispatcher=request.getRequestDispatcher("success");
         			
         			requestDispatcher.forward(request, response);
         			
         			
         			
				}
         		
         		else
         		{
         			printWriter.println("<h2> You have not accept the terms and conditions ");
         		}
         		
         		 }
         		 else
         		 {
         			printWriter.println("<h2> You have not accept the terms and conditions ");
         			
         			// i want to include output of index.html
         			
         			// get the object of Request Dispatcher
         			
         			 RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
         			 
         			 requestDispatcher.include(request, response);
         			 
         			 
         			 
         			 
         		 }
		
         		 
         	
         		 
         		 
	}

}
