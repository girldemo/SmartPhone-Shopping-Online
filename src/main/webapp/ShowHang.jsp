<%@page import="Model.E_Hang"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		.top{
			display: inline-block;
		}
		a{
			text-decoration: none;
			color: #0000FF;
		}
		aho:hover a{
		color: blue;
}
	</style>
	<script type="text/javascript">
		function load_timkiem() {
			document.form.txt_timkiemHang.value = "";
		}
	</script>
</head>
<body>
	<div>
		
		 <div>
		 	<form name = "form" action="C_DienThoai" method="get">
		 		<div class="top" ><input type="text" name = "txt_timkiemHang" value = "Nhập vào tìm kiếm" onfocus="load_timkiem()"></div>
		 	 <div class="top" style="margin-right: 5px;width: auto;"><input type="submit" name="but_timkiemHang" value ="Tim Kiem"></div>
			 <div class="top" style="text-align:center;background-color: #99FFFF;width: 100px;height: auto;border-radius: 5px ;"><a href = "./C_DienThoai?modethemmoihang=mode">Them Moi</a></div>
		 	</form>
		 	
		 </div>
		 <% 
		 ArrayList <E_Hang> listHang = (ArrayList)request.getAttribute("listHang"); 
		 %>
		 <table border="1" style="width: 100%;text-align: center;">
		 	<caption>DS Hãng</caption>
		 	<tr>
		 		<th>Mã Hãng </th>
		 		<th>Tên Hãng </th>
		 		<th>Chức Năng</th>
		 	</tr>
		 	
		 	
		 	<%
		 		for(int i = 0;i< listHang.size();i++){
		 	%>
		 		<tr>
		 		<td><%=listHang.get(i).getMaHang()%></td>
		 		<td><%=listHang.get(i).getTenHang() %></td>
		 		<td><a href="C_DienThoai?modeupdateHang=<%=listHang.get(i).getMaHang()%>"> UPDATE</a> 
		 		</tr>
		 		<%} %>
	
		 </table>
	</div>
</body>

</html>