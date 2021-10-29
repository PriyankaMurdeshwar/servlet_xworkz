package com.xworkz.gym.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GymServlet extends HttpServlet {
	
	public GymServlet() {
		System.out.println("GymServlet created");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("invoked service in gym servlet");
		
		String gymName = request.getParameter("gymName");
		System.out.println("Gym name ".concat(gymName));
		//System.out.println("Gym name "+(gymName));
		
		String location = request.getParameter("location");
		//System.out.println("Gym loaction".concat(location));
		System.out.println("Gym loaction "+(location));
		
		String fees = request.getParameter("fees");
		System.out.println("Gym name ".concat(fees));
		
		String ratings = request.getParameter("ratings");
		System.out.println("Gym name ".concat(ratings));
		
		String reviews = request.getParameter("reviews");
		System.out.println("Gym name ".concat(reviews));
		
		String contact = request.getParameter("contact");
		System.out.println("Gym name ".concat("contact"));
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();	
		out.print("<html>");
		out.print("<body style='background-color:#00FFFF'>");
		out.print("<h1>");
		out.print("Details saved for ".concat(gymName));
		out.print("<br>");
		out.print("Location: ".concat(location));
		out.print("<br>");
		out.print("Fees: ".concat(fees));
		out.print("<br>");
		out.print("Ratings: ".concat(ratings));
		out.print("<br>");
		out.print("Reviews: ".concat(reviews));
		out.print("<br>");
		out.print("Contact: ".concat(contact));
		out.print("<br>");
		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		

	}
}
