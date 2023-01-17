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
        <li><a href = "C_DienThoai" target="T3">Quản Lý Điện Thoại</a></li>
        <li><a href = "C_DienThoai?modeQLHang=1" target="T3">Quản Lý Hãng</a></li>

        <hr>
        <li><a href = "./index2.jsp" target="_top">Đăng Xuất</a></li>
    </ul>
  </body>
</html>