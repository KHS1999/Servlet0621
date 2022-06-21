package com.khs.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet/test07")
public class ServletTest07Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 주소, 카드, 가격
		// 전달받고,
		// 서울시 가 포함되어 있지 않으면 배달불가
		// 신한카드가 결제 불가 카드
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String priceString = request.getParameter("price");
		int price = Integer.parseInt(priceString);
		
		out.println("<html><head></head><title>배달의 민족</title><body>");
		
	
		if(!address.contains("서울시")) {
			out.println("<h2>배달불가지역입니다.</h2>");
		}
		else if(card.equals("신한카드")) {
			out.println("<h2>결제불가 카드입니다.</h2>");
		}else {
			
			out.println("<h3>" + address +"배달 준비중</h3>");
			out.println("<hr>결제금액:" + price + "원");
			
		}
		out.println("</body></html>");
		
	}
}
