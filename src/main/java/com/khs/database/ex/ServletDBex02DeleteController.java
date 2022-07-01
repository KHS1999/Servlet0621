package com.khs.database.ex;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khs.common.MysqlService;
@WebServlet("/db/ex02/delete")
public class ServletDBex02DeleteController extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		
		MysqlService mysqlService  = MysqlService.getInstance();
		mysqlService.connect();
		
		String query = "DELETE FROM `new_user` WHERE `id` =" + id +" ;";
		
		mysqlService.update(query);
		
		try {
			response.sendRedirect("/db/ex02.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
