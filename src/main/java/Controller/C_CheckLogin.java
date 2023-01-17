package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import Model.CheckLoginBO;


/**
 * Servlet implementation class C_CheckLogin
 */
@WebServlet("/C_CheckLogin")
public class C_CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_CheckLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		System.out.println("da vao checklogin");
		if(request.getParameter("login")!= null) {
			System.out.println("check login");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			request.setAttribute("username",username);
			CheckLoginBO checkLoginBO = new CheckLoginBO();
			if(checkLoginBO.isValidUser(username,password)) {
				RequestDispatcher rd = null;
				 rd = getServletContext().getRequestDispatcher("/indexQuanLy.jsp");
				rd.forward(request,response);
			}
			else 
			{
				System.out.println("sai mk or tk");
				RequestDispatcher rd = null;
				 rd = getServletContext().getRequestDispatcher("/login.jsp");
				rd.forward(request,response);
			}
		}
	}
}
