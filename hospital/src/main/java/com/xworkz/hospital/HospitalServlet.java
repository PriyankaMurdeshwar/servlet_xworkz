package com.xworkz.hospital;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HospitalServlet extends HttpServlet{
	
	public HospitalServlet() {
		System.out.println("Hospital Servlet created");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("invoked service in hospital servlet");
		
		String hospitalName = request.getParameter("hospitalName");
		System.out.println("Gym name ".concat(hospitalName));
		
		String founder = request.getParameter("founder");
		System.out.println("Gym name ".concat(founder));
		
		String establishedDate = request.getParameter("establishedDate");
		System.out.println("Gym name ".concat(establishedDate));
		
		String specialization = request.getParameter("specialization");
		System.out.println("Gym name ".concat(specialization));
		
		String chiefDoctor = request.getParameter("chiefDoctor");
		System.out.println("Gym name ".concat(chiefDoctor));
		
		String noOfNurse = request.getParameter("noOfNurse");
		System.out.println("Gym name ".concat(noOfNurse));
		
		String noOfBeds = request.getParameter("noOfBeds");
		System.out.println("Gym name ".concat(noOfBeds));
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#1589FF'>");
		out.print("<h1>");
		out.print("Details saved for: ".concat(hospitalName));
		out.print("<br>");
		out.print("Founder: ".concat(founder));
		out.print("<br>");
		out.print("Established Date: ".concat(establishedDate));
		out.print("<br>");
		out.print("Specialization: ".concat(specialization));
		out.print("<br>");
		out.print("Chief Doctor: ".concat(chiefDoctor));
		out.print("<br>");
		out.print("No Of Nurse: ".concat(noOfNurse));
		out.print("<br>");
		out.print("No Of Beds: ".concat(noOfBeds));
		out.print("<br>");
		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		}

}
