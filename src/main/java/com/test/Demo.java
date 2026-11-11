package com.test;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String num=request.getParameter("number");
		int n= Integer.parseInt(num);
		
		/*Printing response on console
		if(n%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		*/
		
		//Printing response in forntend
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		if(n%2==0) {
			out.println("<h3 style='color:green'> this number "+n+" is even number");
		}
		else {
			out.println("<h3 style='color:red'> this number "+n+" is odd number");
		}
		
	}

}
