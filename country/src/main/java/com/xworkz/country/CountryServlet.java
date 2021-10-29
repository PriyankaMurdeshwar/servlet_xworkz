package com.xworkz.country;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet{
	
	public CountryServlet() {
	System.out.println("created");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("invoked service in hospital servlet");
		
		String countryName = request.getParameter("countryName");
		System.out.println("Country name".concat(countryName));
		
		String countryCode = request.getParameter("countryCode");
		System.out.println("Country Code ".concat(countryCode));
		
		String num = request.getParameter("num");
		System.out.println("Population ".concat(num));
		
		String language = request.getParameter("language");
		System.out.println("Language ".concat(language));
		
		String capital = request.getParameter("capital");
		System.out.println("Capital ".concat(capital));
		
		String primeMinister = request.getParameter("primeMinister");
		System.out.println("PrimeMinister ".concat(primeMinister));
		
		String president = request.getParameter("president");
		System.out.println("President ".concat(president));
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#FF8C00'>");
		out.print("<h1>");
		out.print("Details saved for: ".concat(countryName));
		out.print("<br>");
		out.print("Country Code: ".concat(countryCode));
		out.print("<br>");
		out.print("Population: ".concat(num));
		out.print("<br>");
		out.print("Language: ".concat(language));
		out.print("<br>");
		out.print("Capital: ".concat(capital));
		out.print("<br>");
		out.print("Prime Minister: ".concat(primeMinister));
		out.print("<br>");
		out.print("President: ".concat(president));
		out.print("<br>");
		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		}
	}


