package com.xworkz.grocery;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GroceryServlet extends HttpServlet {
	
	public GroceryServlet() {
	System.out.println(" Grocery Servlet created");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("invoked service in hospital servlet");
		
		String groceryName = request.getParameter("groceryName");
		System.out.println("grocery name".concat(groceryName));
		
		String price = request.getParameter("price");
		System.out.println("Price ".concat(price));
		
		String type = request.getParameter("type");
		System.out.println("Type".concat(type));
		
		String quantity = request.getParameter("quantity");
		System.out.println("Quantity ".concat(quantity));
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#C9BE62'>");
		out.print("<h1>");
		out.print("Details saved for: ".concat(groceryName));
		out.print("<br>");
		out.print("Price: ".concat(price));
		out.print("<br>");
		out.print("Type: ".concat(type));
		out.print("<br>");
		out.print("Quantity: ".concat(quantity));
		out.print("<br>");
	
		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		}
	}
