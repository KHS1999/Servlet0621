package com.khs.database.test;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khs.common.MysqlService;
@WebServlet("/db/test02/insert")
public class ServletDBTest02Controller extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		String query = " INSERT INTO `URL` (`name`,`url`,`createdAt`,`updatedAt`)\r\n"
				+ " VALUE\r\n"
				+ " ('" + name + "','" + url + "',now(),now());";
		
		int count = mysqlService.update(query);
		
		try {
			response.sendRedirect("/db/test01.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
