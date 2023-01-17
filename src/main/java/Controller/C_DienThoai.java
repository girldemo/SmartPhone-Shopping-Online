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

import Model.BO_DienThoai;
import Model.E_DienThoai;
import Model.E_Hang;
import Model.E_Mua;


/**
 * Servlet implementation class C_DienThoai
 */
@WebServlet("/C_DienThoai")
public class C_DienThoai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public C_DienThoai() {
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
		System.out.println("vao dost");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		RequestDispatcher rd = null; 
		BO_DienThoai bo_DienThoai = new BO_DienThoai();
		ArrayList<E_DienThoai> listDT = new ArrayList<E_DienThoai>();
		ArrayList<E_Hang> listHang = new ArrayList<E_Hang>();
		ArrayList<E_Mua> listMua = new ArrayList<E_Mua>();
		if(request.getParameter("but_timkiem")!= null) {
			System.out.println("Da vao timkiem");
			String txt_timkiem = (String)request.getParameter("txt_timkiem");
			listDT = bo_DienThoai.getAllDTByTimkiem(txt_timkiem);
			request.setAttribute("listDT", listDT);
			rd=request.getRequestDispatcher("/XemTTDT.jsp");
			rd.forward(request, response);
		}else if(request.getParameter("modethemmoi")!= null) {
			System.out.println("Da vao them");
			listHang = bo_DienThoai.getAllHang();
			request.setAttribute("listHang", listHang);
			//String txt_timkiem = (String)request.getParameter("txt_timkiem");
			//listDT = bo_DienThoai.getAllDTByTimkiem(txt_timkiem);
			//request.setAttribute("listDT", listDT);
			rd=request.getRequestDispatcher("/formAdd.jsp");
			rd.forward(request, response);
		}
		else if(request.getParameter("add")!= null) {
			System.out.println("Da vao form add");
			String ma= (String)request.getParameter("txt_ma");
			String ten= (String)request.getParameter("txt_ten");
			String mahang= (String)request.getParameter("select");
			String mau= (String)request.getParameter("txt_mau");
			String gia= (String)request.getParameter("txt_gia");
			Double g = Double.parseDouble(gia);
			String manhinh= (String)request.getParameter("txt_manhinh");
			String CPU= (String)request.getParameter("txt_CPU");
			String bonhotrong= (String)request.getParameter("txt_bonhotrong");
			String camera= (String)request.getParameter("txt_camera");
			String tinhtrang= (String)request.getParameter("radio");
			String image = (String)request.getParameter("txt_image");
			Boolean check = false;
			if(tinhtrang.equals("Nam")) {
				check = true;
			}
			System.out.println(g);
			bo_DienThoai.AddDT(ma,ten,mahang,mau,g,manhinh,CPU,bonhotrong,camera,image,check);
			response.sendRedirect("C_DienThoai");
		}
		
		//add hãng ================================================================
		else if(request.getParameter("addhang")!= null) {
			System.out.println("Da  addhang");
			String ma= (String)request.getParameter("txt_ma");
			String ten= (String)request.getParameter("txt_ten");
			bo_DienThoai.AddHang(ma,ten);
			response.sendRedirect("C_DienThoai?modeQLHang=ad");
		}
		
		else if(request.getParameter("modethemmoihang")!= null) {
			System.out.println("Da vao form addhang");
			response.sendRedirect("formAddHang.jsp");
		}
		else if(request.getParameter("modeupdate")!= null) {
			System.out.println("Da vao form update");
			String ma =(String)request.getParameter("modeupdate");
			E_DienThoai dt =  bo_DienThoai.getDTByID(ma);
			listHang = bo_DienThoai.getAllHang();
			request.setAttribute("listHang", listHang);
			E_Hang hang = bo_DienThoai.getHangByMaHang(dt.getMaHangDT());
			System.out.println(dt.getMaHangDT());
			System.out.println(hang.getTenHang());
			request.setAttribute("dt",dt);
			request.setAttribute("hang",hang);
			rd =request.getRequestDispatcher("/formUpdate.jsp");
			rd.forward(request, response);
			
		}
		else if(request.getParameter("update")!= null) {
			System.out.println("Da vao form update");
			String ma= (String)request.getParameter("txt_ma");
			String ten= (String)request.getParameter("txt_ten");
			String mahang= (String)request.getParameter("select");
			String mau= (String)request.getParameter("txt_mau");
			String gia= (String)request.getParameter("txt_gia");
			Double g = Double.parseDouble(gia);
			String manhinh= (String)request.getParameter("txt_manhinh");
			String CPU= (String)request.getParameter("txt_CPU");
			String bonhotrong= (String)request.getParameter("txt_bonhotrong");
			String camera= (String)request.getParameter("txt_camera");
			String image= (String)request.getParameter("txt_image");
			String tinhtrang= (String)request.getParameter("radio");
			Boolean check = false;
			if(tinhtrang.equals("Nam")) {
				check = true;
			}
			bo_DienThoai.Update(ma,ten,mahang,mau,g,manhinh,CPU,bonhotrong,camera,image,check);
			response.sendRedirect("C_DienThoai");
		}
		else if(request.getParameter("modedelete")!= null) {
			System.out.println("Da vao deldete");
			String ma= (String)request.getParameter("modedelete");
			bo_DienThoai.DeleteDT(ma);
			response.sendRedirect("C_DienThoai");
		}
		else if(request.getParameter("showDT")!= null) {
			System.out.println("vao showDT");
			listHang = bo_DienThoai.getAllHang();
			listDT = bo_DienThoai.getAllDT();
			request.setAttribute("listDT", listDT);
			request.setAttribute("listHang", listHang);
			rd=request.getRequestDispatcher("/ShowDT.jsp");
			rd.forward(request, response);
		}
		else if(request.getParameter("modesearch")!= null) {
			System.out.println("vao search");
			String txt_timkiem = (String)request.getParameter("txt_search");
			listDT = bo_DienThoai.getAllDTByTimkiem(txt_timkiem);
			request.setAttribute("listDT", listDT);
			rd=request.getRequestDispatcher("/ShowDT.jsp");
			rd.forward(request, response);
		}
		else if(request.getParameter("but_search")!= null) {
			System.out.println("vao search");
			String txt_timkiem = (String)request.getParameter("txt_search");
			listDT = bo_DienThoai.getAllDTByTimkiem(txt_timkiem);
			request.setAttribute("listDT", listDT);
			rd=request.getRequestDispatcher("/ShowDT.jsp");
			rd.forward(request, response);
		}
		else if(request.getParameter("modechitietdienthoai")!= null) {
			System.out.println("vao search");
			String chitiet = (String)request.getParameter("modechitietdienthoai");
			E_DienThoai dt = bo_DienThoai.getDTByID(chitiet);
			
			request.setAttribute("dt",dt);
			rd=request.getRequestDispatcher("/showdetailDT.jsp");
			rd.forward(request, response);
		}
		//Quan Ly Hang
		else if(request.getParameter("modeQLHang")!= null) {
			listHang = bo_DienThoai.getAllHang();
			request.setAttribute("listHang",listHang);
			rd=request.getRequestDispatcher("ShowHang.jsp");
			rd.forward(request, response);
		}
		else if(request.getParameter("but_timkiemHang")!= null) {
			String txt_timkiem = (String)request.getParameter("txt_timkiemHang");
			listHang = bo_DienThoai.getAllHangByTimkiem(txt_timkiem);
			request.setAttribute("listHang",listHang);
			rd=request.getRequestDispatcher("ShowHang.jsp");
			rd.forward(request, response);
		}
		///update Hang =======================================================================
		else if(request.getParameter("modeupdateHang")!= null) {
			String mahang= (String)request.getParameter("modeupdateHang");
			E_Hang hang = bo_DienThoai.getHangByMaHang(mahang);
			request.setAttribute("hang",hang);
			rd=request.getRequestDispatcher("formUpdateHang.jsp");
			rd.forward(request, response);
		}
		else if(request.getParameter("updatehang")!= null) {
			String mahang= (String)request.getParameter("txt_mahang");
			String tenhang= (String)request.getParameter("txt_tenhang");
			bo_DienThoai.UpdateHang(mahang,tenhang);
			response.sendRedirect("C_DienThoai?modeQLHang=ad");
		}
		
		
		////Mua DT====================================================== Tien code tu day
		else if(request.getParameter("mua") != null)		
		{
			String tinhtrang = request.getParameter("tinhtrang");
			if (tinhtrang.equals("true"))
			{
				String madt = request.getParameter("madt");
				String soluong = request.getParameter("soluong");
				bo_DienThoai.addGioHang(madt, Integer.valueOf(soluong));  //add dt vao gio hang 
				listMua = bo_DienThoai.getGioHang();					// hien thi
				request.setAttribute("listMua", listMua);
				rd = request.getRequestDispatcher("GioHang.jsp");
				rd.forward(request, response);
			}
			else
			{
				response.sendRedirect("HetHang.jsp");
			}
		}
		else if (request.getParameter("giohang") != null)		// xem gio hang
		{
			listMua = bo_DienThoai.getGioHang();					
			request.setAttribute("listMua", listMua);
			rd = request.getRequestDispatcher("GioHang.jsp");
			rd.forward(request, response);
		}
		else if (request.getParameter("xoagiohang") != null)
		{
			String madt = request.getParameter("madt");
			String soluong = request.getParameter("soluong");
			System.out.println(madt);
			System.out.println(soluong);
			bo_DienThoai.deleteGioHang(madt, Integer.valueOf(soluong));  //xoa dt o gio hang 
			listMua = bo_DienThoai.getGioHang();					// hien thi
			request.setAttribute("listMua", listMua);
			rd = request.getRequestDispatcher("GioHang.jsp");
			rd.forward(request, response);
		}
		
		////////////// hoa don
		else if (request.getParameter("tongtien") != null)
		{
			String tongtien = request.getParameter("tongtien");
			listMua = bo_DienThoai.getGioHang();
			request.setAttribute("listMua", listMua);
			request.setAttribute("tongtien", tongtien);
			rd = request.getRequestDispatcher("HoaDon.jsp");
			rd.forward(request, response);
		}
		else if (request.getParameter("hoadon") != null)
		{
			String gioitinh = request.getParameter("gioitinh");
			String hoten = request.getParameter("hoten");
			String sdt = request.getParameter("sdt");
			String diachi = request.getParameter("diachi");
			String yeucau = request.getParameter("yeucau");
			String strmadt = request.getParameter("strmadt");
			String strsoluong = request.getParameter("strsoluong");
			if (gioitinh.equals("nam"))
			{
				bo_DienThoai.createHoaDon(hoten, true, sdt, diachi, yeucau, strmadt, strsoluong);
			}
			else
			{
				bo_DienThoai.createHoaDon(hoten, false, sdt, diachi, yeucau, strmadt, strsoluong);
			}
			bo_DienThoai.deleteAllGioHang();
//			System.out.println(gioitinh);
//			System.out.println(hoten);
//			System.out.println(sdt);
//			System.out.println(diachi);
//			System.out.println(yeucau);
//			System.out.println(strmadt);
//			System.out.println(strsoluong);
//			System.out.println("----");
			response.sendRedirect("index2.jsp");
		}
		
		//// tim kiem dien thoai
		else if (request.getParameter("sw") != null)	// theo ten
		{
			System.out.println("vao tim kiem theo hang");
			String mahang = request.getParameter("sw");
			listHang = bo_DienThoai.getAllHang();
			listDT = bo_DienThoai.searchByName(mahang);
			request.setAttribute("listDT", listDT);
			request.setAttribute("listHang", listHang);
			rd=request.getRequestDispatcher("/ShowDT.jsp");
			rd.forward(request, response);
		}
		else if (request.getParameter("indexG") != null) // theo gia
		{
			System.out.println("vao tim kiem theo gia");
			String index = request.getParameter("indexG");
			listHang = bo_DienThoai.getAllHang();
			listDT = bo_DienThoai.searchByPrice(index);
			request.setAttribute("listHang", listHang);
			request.setAttribute("listDT", listDT);
			rd=request.getRequestDispatcher("/ShowDT.jsp");
			rd.forward(request, response);
		}
		/////////
		else {
			System.out.println("Da vao xem all");
			listDT = bo_DienThoai.getAllDT();
			request.setAttribute("listDT", listDT);
			System.out.println(listDT.size());
			rd =request.getRequestDispatcher("/XemTTDT.jsp");
			rd.forward(request, response);
		}
		
	}

}
