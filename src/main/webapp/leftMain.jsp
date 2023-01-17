	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>T2</title>
    <meta charset="UTF-8">
    <style>
        body{
          background-color:rgb(42, 126, 165) ;
        }
        li{ font-size :15px;
            list-style-type : none;
            height: 40px;
        }
        a{
             text-decoration: none;
             color : white;
        }
    </style>
  </head>
  <body>
    <ul>
        <li><a href = "#" target="T3">TRANG CHỦ</a></li>
        <li><a href = "C_DienThoai?showDT=all" target="T3">ĐIỆN THOẠI</a></li>
		<li><a href = "C_DienThoai?giohang=1" target="T3">GIỎ HÀNG</a></li>
		<br>
        <hr>
        <li><a href = "./login.jsp" target="_top">Đăng Nhập</a></li>
    </ul>
  </body>
</html>