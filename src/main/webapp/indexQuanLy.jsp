<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<frameset border = 0 padding = "-1">
    <frameset ROWS = "50, *, 120">
        <frame name = "T1" src = "./header.jsp"></frame>

        <frameset cols = "200,*,150">
            <frame name = "T2" src = "./leftMainQL.jsp"></frame>
            <frame name = "T3" src = "./TrangChu.jsp"></frame>
            <frame name = "T4" src = "./rightMain.jsp"></frame>
        </frameset>

        <frame name = "T5" src = "./footer.jsp"></frame>
    </frameset>
</frameset>