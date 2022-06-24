<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	<%
		// cm 단위의 길이
		// 변환할 단위 (체크박스 기반의 여러개)
		int length = Integer.parseInt(request.getParameter("length"));
		// 변환할 단위 여러개
		String[] units = request.getParameterValues("units");
		// inch, yard, feet, meter
		// {inch, yard}
		String result ="";
		for(int i=0; i < units.length; i++){
			String unit = units[i];
			if(unit.equals("inch")){
				double inch = length * 0.39;
				result +=  inch + "in<br>";		
			} else if(unit.equals("yard")){
				double yard = length * 0.010936133;
				result += yard + "yd<br>";
			} else if(unit.equals("feet")){
				double feet = length * 0.032808399;
				result += feet + "ft<br>";
			} else {
				double meter = length / 100.0;
				result += meter + "m<br>";
			}
		}		
	%>
	<div>
		<h2>변환결과</h2>
		
		<h3><%=length %>cm</h3>
		
		<hr>
		
		<h3><%=result %></h3>


	</div>
</body>
</html>