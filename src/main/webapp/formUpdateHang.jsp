<%@page import="java.util.ArrayList"%>
<%@page import="Model.E_Hang"%>
<%@page import="Model.E_DienThoai"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formAdd</title>
<script type="text/javascript">
		function txt_load() {
			document.formupdatehang.txt_tenhang.value = "";
		}
	</script>
</head>
<body>
	<div>
	<form name="formupdatehang" action="C_DienThoai" method="post">
		<%
			E_Hang hang = (E_Hang)request.getAttribute("hang");
		
		%>
		<table style="margin-left: 40%">
			<caption><h1>Form UpdateDT</h1></caption>
			<tr>
				<td>Mã Hãng</td>
				<td><input type = "text" name= "txt_mahang" value = <%=hang.getMaHang() %> readonly="true"></td>
			</tr>
			<tr>
				<td>Tên Hãng</td>
				<td><input type = "text" name= "txt_tenhang" value = <%=hang.getTenHang() %> onfocus="txt_load()"></td>
			</tr>
			<tr>
				<td style="text-align: right"><input type="submit" value = "Update" name = "updatehang"></td>
				<td><input type="reset" name = "reset"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>