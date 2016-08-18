package com.capitalone.endpointchecker;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EndpointChecker
 */
@WebServlet("/EndpointChecker")
public class EndpointChecker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String url = request.getParameter("url");

		System.out.println("Name: " + name);
		System.out.println("URL: " + url);
		
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("url", url);
		
		response.sendRedirect("html/pageTwo.html");

	}

}
