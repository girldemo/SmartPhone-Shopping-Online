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
		function txt_ma_load() {
			document.formaddDT.txt_ma.value = "";
		}
		function txt_ten_load() {
			document.formaddDT.txt_ten.value = "";
		}
		function txt_mau_load() {
			document.formaddDT.txt_mau.value = "";
		}
		function txt_gia_load() {
			document.formaddDT.txt_gia.value = "";
		}
		function  txt_manhinh_load{
			document.formaddDT.txt_manhinh.value = "";
		}
		function txt_CPU_load() {
			document.formaddDT.txt_CPU.value = "";
		}
		function txt_BNT_load() {
			document.formaddDT.txt_bonhotrong.value = "";
		}
		function txt_camera_load() {
			document.formaddDT.txt_camera.value = "";
		}
		function txt_image_load() {
			document.formaddDT.txt_image.value = "";
		}
	</script>
</head>
<body>
	<div>
		<%
		ArrayList<E_Hang> listHang  =(ArrayList)request.getAttribute("listHang");
		
		
		%>
	<form name ="formaddDT" action="C_DienThoai">
		<table style="margin-left: 40%">
			<caption><h1>Form Add DT</h1></caption>
			<tr>
				<td>Mã ĐT</td>
				<td><input type = "text" name= "txt_ma" value = "DT00" onfocus="txt_ma_load()"></td>
			</tr>
			<tr>
				<td>Tên ĐT</td>
				<td><input type = "text" name= "txt_ten" value = "Nhap tendt" onfocus="txt_ten_load()"></td>
			</tr>
			<tr>
				<td>Hãng</td>
				<td>
					<select name = "select">
						<%
						for(int i =0;i<listHang.size();i++){
						%>
							<option value=<%=listHang.get(i).getMaHang() %>><%=listHang.get(i).getTenHang() %></option>
						<%} 
						%>
					</select>
				</td>
			</tr>
			<tr>
				<td>Màu</td>
				<td><input type = "text" name= "txt_mau" value = "Nhap mau" onfocus="txt_mau_load()"></td>
			</tr>
			<tr>
				<td>Giá</td>
				<td><input type = "text" name= "txt_gia" value = "Nhap gia" onfocus="txt_gia_load()"></td>
			</tr>
			<tr>
				<td>Màn Hình</td>
				<td><input type = "text" name= "txt_manhinh" value = "Nhap man hinh" onfocus="txt_manhinh_load()"></td>
			</tr>
			<tr>
				<td>CPU</td>
				<td><input type = "text" name= "txt_CPU" value = "Nhap CUP" onfocus="txt_CPU_load()"></td>
			</tr>
			<tr>
				<td>Bộ Nhớ Trông</td>
				<td><input type = "text" name= "txt_bonhotrong" value = "Nhap Bo nho" onfocus="txt_BNT_load()"></td>
			</tr>
			<tr>
				<td>Camera</td>
				<td><input type = "text" name= "txt_camera" value = "Nhap Cammera" onfocus="txt_camera_load()"></td>
			</tr>
			<tr>
				<td>Image</td>
				<td><input type = "text" name= "txt_image" value = "Nhap image" onfocus="txt_image_load()"></td>
			</tr>
			<tr>
				<td>Tình Trạng</td>
				<td>
					<input type = "radio" name= "radio" value = "Nam" checked="checked">
					<input type = "radio" name= "radio" value = "Nu">
				</td>
			</tr>
			<tr>
				<td style="text-align: right"><input type="submit" value = "Add" name = "add"></td>
				<td><input type="reset" name = "reset"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>