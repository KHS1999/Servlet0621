package com.khs.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test03")
public class ServletTest03Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		SimpleDateFormat fomatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String datestring = fomatter.format(now);
		
		
		out.println("<html><head><h2>[단독] 고양이가 야옹해</h2></head>");
		out.println("<body>기사입력시간" + datestring + "<hr>끝</body>");
	}

}
