package com.khs.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest02Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		Date now = new Date();
		
		
		SimpleDateFormat fomatter = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
		String dateString = fomatter.format(now);
		
		PrintWriter out = response.getWriter();
		
		out.println(dateString);
	}
	

}
