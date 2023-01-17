 <%@page import="Model.E_DienThoai"%>
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
</head>
<body>
	<div>
		
		 <div>
		 	<form name = "form" action="C_DienThoai" method="get">
		 		<div class="top" ><input type="text" name = "txt_timkiem" value = "Nhập vào tìm kiếm" onfocus="load_timkiem()"></div>
		 	 <div class="top" style="margin-right: 5px;width: auto;"><input type="submit" name="but_timkiem" value ="Tim Kiem"></div>
			 <div class="top" style="text-align:center;background-color: #99FFFF;width: 100px;height: auto;border-radius: 5px ;"><a href = "./C_DienThoai?modethemmoi=mode">Them Moi</a></div>
		 	</form>
		 	
		 </div>
		 <% 
		 ArrayList <E_DienThoai> listDT = (ArrayList)request.getAttribute("listDT"); 
		 %>
		 <table border="1" style="width: 100%;text-align: center;">
		 	<caption>DS Sản Phẩm</caption>
		 	<tr>
		 		<th>Mã </th>
		 		<th>Tên </th>
		 		<th>Hãng</th>
		 		<th>Màu</th>
		 		<th>Giá</th>
		 		<th>Màn hình</th>
		 		<th>CPU</th>
		 		<th>Bộ Nhớ Trong</th>
		 		<th>Chức Năng</th>
		 	</tr>
		 	
		 	
		 	<%
		 		for(int i = 0;i< listDT.size();i++){
		 	%>
		 		<tr>
		 		<td><%=listDT.get(i).getMaDT()%></td>
		 		<td><%=listDT.get(i).getTenDT() %></td>
		 		<td><%=listDT.get(i).getMaHangDT()%></td>
		 		<td><%=listDT.get(i).getMau()%></td>
		 		<td><%=listDT.get(i).getGia()%></td>
		 		<td><%=listDT.get(i).getManHinh()%></td>
		 		<td><%=listDT.get(i).getCPU()%></td>
		 		<td><%=listDT.get(i).getBoNhoTrong()%></td>
		 		<td><a href="C_DienThoai?modeupdate=<%=listDT.get(i).getMaDT()%>"> UPDATE</a> | <a href="#" onclick= "showMs('<%=listDT.get(i).getMaDT()%>')">DELETE</a></td>
		 		</tr>
		 		<%} %>
	
		 </table>
	</div>
</body>
<script type="text/javascript">
		function showMs(id) {
			var option = confirm("Ban co muon xoa DT nay khong");
			 if(option == true){
				 window.location.href = "C_DienThoai?modedelete="+id;
			 }
		}
		function load_timkiem() {
			document.form.txt_timkiem.value = "";
		}
	</script>
</html>