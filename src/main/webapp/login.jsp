<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Đăng nhập</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style type="text/css">
        	@charset "UTF-8";
* {
    padding: 0;
    margin: 0;
    box-sizing: border-box;
    text-decoration: none;
    outline: none;
}
:root {
    --bg-color: #f7f7f7;
    --card-bg-color: white;
    --text-color: #78899F;
    --btn-color: #337AB7;
    --btn-color-hover: #286090;
}

html {
    font-size: 16px;
}

body {
    width: 100%;
    height: 100vh;
    background-color: var(--bg-color);
    color: var(--text-color);
    overflow-x: hidden;
}

.submit-btn {
    padding: 10px;
    color: white;
    background-color: var(--btn-color);
    border: none;
    border-radius: 4px;
    cursor: pointer;
    width: 100px;
}

.submit-btn:hover {
    background-color: var(--btn-color-hover);
}

.container {
    display: flex;
    flex-direction: column;
    align-items: center;
    height: 100%;
    margin-top: 50px;
}

h1 {
    margin-bottom: 20px;
}

form {
    display: flex;
    flex-direction: column;
    width: 15%;
    align-items: center;
}

input {
    width: 100%;
    height: 32px;
    margin-bottom: 15px;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
}
        	
        </style>
    </head>
    <body>
<div class="container">
    <h1>ĐĂNG NHẬP</h1>
<form method="post" action="C_CheckLogin">
  <input type="text" id="username" name="username" placeholder="Tên đăng nhập" required>
  <input type="password" id="password" name="password" placeholder="Mật khẩu" required>

  <input class="submit-btn" type="submit" name ="login" value = "Đăng Nhập">
</form>
</div>
</body>
</html>
