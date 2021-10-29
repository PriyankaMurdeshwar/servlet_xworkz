package com.xworkz.music;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MusicServlet extends HttpServlet {
	public MusicServlet() {
	System.out.println("Music Servlet created");
	}
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("invoked service in hospital servlet");
		
		String albumName = request.getParameter("albumName");
		System.out.println("Album name".concat(albumName));
		
		String singer = request.getParameter("singer");
		System.out.println("Singer ".concat(singer));
		
		String lyricist = request.getParameter("lyricist");
		System.out.println("Lyricist".concat(lyricist));
		
		String language = request.getParameter("language");
		System.out.println("Language ".concat(language));
		
		System.out.println("starting to write response");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body style='background-color:#4000ff'>");
		out.print("<h1>");
		out.print("Details saved for: ".concat(albumName));
		out.print("<br>");
		out.print("Singer: ".concat(singer));
		out.print("<br>");
		out.print("Lyricist: ".concat(lyricist));
		out.print("<br>");
		out.print("Language: ".concat(language));
		out.print("<br>");
	
		out.print("Thank you !!!");
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		}
	}


