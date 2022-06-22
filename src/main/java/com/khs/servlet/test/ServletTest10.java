package com.khs.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test10")
public class ServletTest10 extends HttpServlet{
	
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "hagulu");
	        put("password", "asdf");
	        put("name", "김인규");
	    }
	};
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String Mapid = userMap.get("id");
		String Mappassword = userMap.get("password");
		String Mapname = userMap.get("name");
		
		out.println("<html><head><title></title></head><body>");
		if(!Mapid.equals(id)) {
			out.println("id가 일치하지 않습니다.");
		}else if(!Mappassword.equals(password)) {
			out.println("password가 일치하지 않습니다.");
		}else {
			out.println("<h2>"+ Mapname+"님 환영합니다.</h2>");
		}
		out.println("</body></html>");
	}

}
