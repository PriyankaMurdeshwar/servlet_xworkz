package com.xworkz.sweet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SweetServlet extends HttpServlet{
	
	public SweetServlet() {
		System.out.println("Sweet Servlet created");
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
System.out.println("invoked service in hospital servlet");
		
		String sweetName = request.getParameter("sweetName");
		System.out.println("Sweet name".concat(sweetName));
		
		String origin = request.getParameter("origin");
		System.out.println("Origin ".concat(origin));
		
		String color = request.getParameter("color");
		System.out.println("Color".concat(color));
		
		String price = request.getParameter("price");
		System.out.println("Price ".concat(price));
		
		String quantity = request.getParameter("quantity");
		System.out.println("Quantity ".concat(quantity));
		
		String taste = request.getParameter("taste");
		System.out.println("Taste ".concat(taste));
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#ff1a8c'>");
		out.print("<h1>");
		out.print("Details saved for: ".concat(sweetName));
		out.print("<br>");
		out.print("Origin: ".concat(origin));
		out.print("<br>");
		out.print("Color: ".concat(color));
		out.print("<br>");
		out.print("Price: ".concat(price));
		out.print("<br>");
		out.print("Quantity: ".concat(quantity));
		out.print("<br>");
		out.print("Taste: ".concat(taste));
		out.print("<br>");
	
		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		}
	}


