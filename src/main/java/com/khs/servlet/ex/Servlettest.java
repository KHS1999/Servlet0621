package com.khs.servlet.ex;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlettest extends HttpServlet{
	
	@Override
	public void doGet (HttpServletRequest request, HttpServletResponse response) {
		
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	}

}
