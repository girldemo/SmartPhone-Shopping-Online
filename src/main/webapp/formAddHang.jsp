<%@page import="java.util.ArrayList"%>
<%@page import="Model.E_Hang"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formAdd</title>
<script type="text/javascript">
		function load_mahang() {
			document.formaddHang.txt_ma.value = "";
		}
		function load_tenhang() {
			document.formaddHang.txt_ten.value = "";
		}
	</script>
</head>
<body>
	<div>
	<form name = "formaddHang" action="C_DienThoai">
		<table style="margin-left: 40%">
			<caption><h1>Form Add DT</h1></caption>
			<tr>
				<td>Mã Hãng</td>
				<td><input type = "text" name= "txt_ma" value = "Nhap mahang" onfocus="load_mahang()"></td>
			</tr>
			<tr>
				<td>Tên Hãng</td>
				<td><input type = "text" name= "txt_ten" value = "Nhap tenhang" onfocus="load_tenhang()"></td>
			</tr>
				
			<tr>
				<td style="text-align: right"><input type="submit" value = "Add" name = "addhang"></td>
				<td><input type="reset" name = "reset"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>