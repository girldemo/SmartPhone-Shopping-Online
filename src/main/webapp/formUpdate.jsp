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
		function txt_ten_load() {
			document.formupdatedt.txt_ten.value = "";
		}
		function txt_mau_load() {
			document.formupdatedt.txt_mau.value = "";
		}
		function txt_gia_load() {
			document.formupdatedt.txt_gia.value = "";
		}
		function  txt_manhinh_load{
			document.formupdatedt.txt_manhinh.value = "";
		}
		function txt_CPU_load() {
			document.formupdatedt.txt_CPU.value = "";
		}
		function txt_BNT_load() {
			document.formupdatedt.txt_bonhotrong.value = "";
		}
		function txt_camera_load() {
			document.formupdatedt.txt_camera.value = "";
		}
		function txt_image_load() {
			document.formupdatedt.txt_image.value = "";
		}
	</script>
</head>
<body>
	<div>
	<form name = "formupdatedt" action="C_DienThoai" method="post">
		<%
			E_DienThoai dt = (E_DienThoai)request.getAttribute("dt");
			ArrayList<E_Hang> listHang= (ArrayList)request.getAttribute("listHang");
			E_Hang hang = (E_Hang)request.getAttribute("hang");
		
		%>
		<table style="margin-left: 40%">
			<caption><h1>Form UpdateDT</h1></caption>
			<tr>
				<td>Mã ĐT</td>
				<td><input type = "text" name= "txt_ma" value = <%=dt.getMaDT() %> readonly="true"></td>
			</tr>
			<tr>
				<td>Tên ĐT</td>
				<td><input type = "text" name= "txt_ten" value = <%=dt.getTenDT() %> onfocus="txt_ten_load()"></td>
			</tr>
			<tr>
				<td>Hãng</td>
				<td>
					<select name = "select">
						<option value = <%=hang.getMaHang() %>><%=hang.getTenHang() %></option>
						<%for(int i = 0 ;i< listHang.size();i++){ %>
						<option value =<%=listHang.get(i).getMaHang() %>><%=listHang.get(i).getTenHang() %></option>
						
						<%} %>
					</select>
				</td>
			</tr>
			<tr>
				<td>Màu</td>
				<td><input type = "text" name= "txt_mau" value = <%=dt.getMau() %> onfocus="txt_mau_load()"></td>
			</tr>
			<tr>
				<td>Giá</td>
				<td><input type = "text" name= "txt_gia" value = <%=dt.getGia() %> onfocus="txt_gia_load()"></td>
			</tr>
			<tr>
				<td>Màn Hình</td>
				<td><input type = "text" name= "txt_manhinh" value = <%=dt.getManHinh() %> onfocus="txt_manhinh_load()"></td>
			</tr>
			<tr>
				<td>CPU</td>
				<td><input type = "text" name= "txt_CPU" value = <%=dt.getCPU() %> onfocus="txt_CPU_load()"></td>
			</tr>
			<tr>
				<td>Bộ Nhớ Trông</td>
				<td><input type = "text" name= "txt_bonhotrong" value = <%=dt.getBoNhoTrong() %> onfocus="txt_BNT_load()"></td>
			</tr>
			<tr>
				<td>Camera</td>
				<td><input type = "text" name= "txt_camera" value = <%=dt.getCamera()%> onfocus="txt_camera_load()"></td>
			</tr>
			<tr>
				<td>Image</td>
				<td><input type = "text" name= "txt_image" value = <%=dt.getImage()%> onfocus="txt_image_load()"></td>
			</tr>
			<tr>
				<td>Tình Trạng</td>
				<td>
					<input type = "radio" name= "radio" value = "Nam" checked="checked">
					<input type = "radio" name= "radio" value = "Nu">
				</td>
			</tr>
			<tr>
				<td style="text-align: right"><input type="submit" value = "Update" name = "update"></td>
				<td><input type="reset" name = "reset"></td>
			</tr>
		</table>
	</form>
	</div>
</body>
</html>