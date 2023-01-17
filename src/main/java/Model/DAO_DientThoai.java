package Model;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;


public class DAO_DientThoai {
	Connection conn = null;
	PreparedStatement ps= null;
	ResultSet rs= null;
	ArrayList<E_DienThoai> listDT = new ArrayList<E_DienThoai>();
	ArrayList<E_Hang> listHang = new ArrayList<E_Hang>();
	ArrayList<E_Mua> listMua = new ArrayList<E_Mua>();
	public ArrayList<E_DienThoai> getAllDT() {
		DBConnect connect = new DBConnect();
		Connection conn = connect.connect();
		String sql = "select * from DienThoai";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				listDT.add(new E_DienThoai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10),rs.getBoolean(11))) ;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listDT;
	}
	public ArrayList<E_Hang> getAllHang() {
		DBConnect connect = new DBConnect();
		Connection conn = connect.connect();
		String sql = "select * from hang";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				listHang.add(new E_Hang(rs.getString(1), rs.getString(2))) ;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listHang;
	}
	
	public ArrayList<E_DienThoai> getAllDTByTimkiem(String txt) {
		DBConnect connect = new DBConnect();
		Connection conn = connect.connect();
		String sql = "SELECT * FROM dienthoai WHERE MaDT = ? or TenDT like ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,txt);
			ps.setString(2,"%"+txt+"%");
			rs = ps.executeQuery();
			int i=0;
			while(rs.next()) {
				System.out.println(i++);
				listDT.add(new E_DienThoai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10),rs.getBoolean(11))) ;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listDT;
	}
	
	public ArrayList<E_Hang> getAllHangByTimkiem(String txt) {
		DBConnect connect = new DBConnect();
		Connection conn = connect.connect();
		String sql = "SELECT * FROM hang WHERE MaHang = ? or TenHang like ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,txt);
			ps.setString(2,"%"+txt+"%");
			rs = ps.executeQuery();
			int i=0;
			while(rs.next()) {
				System.out.println(i++);
				listHang.add(new E_Hang(rs.getString(1), rs.getString(2)));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return listHang;
	}
	public void AddDT(String ma,String ten,String mahang,String mau,Double gia,String manhinh,String CPU,String bonhotrong,String camera,String image, Boolean tinhtrang) {
		DBConnect connect = new DBConnect();
		Connection conn = connect.connect();
		String sql = "INSERT INTO dienthoai VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,ma);
			ps.setString(2,ten);
			ps.setString(3,mahang);
			ps.setString(4,mau);
			ps.setDouble(5,gia);
			ps.setString(6,manhinh);
			ps.setString(7,CPU);
			ps.setString(8,bonhotrong);
			ps.setString(9,camera);
			ps.setString(10,image);
			ps.setBoolean(11,tinhtrang);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void AddHang(String ma,String ten) {
		DBConnect connect = new DBConnect();
		Connection conn = connect.connect();
		String sql = "INSERT INTO hang VALUES(?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,ma);
			ps.setString(2,ten);
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		
		public void UpdateDT(String ma,String ten,String mahang,String mau,Double gia,String manhinh,String CPU,String bonhotrong,String camera,String image,Boolean tinhtrang) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "UPDATE dienthoai SET TenDT=?,MaHang=?,Mau = ?, Gia= ? ,ManHinh = ? ,CPU = ?,BoNhoTrong = ?,Camera= ?,Image= ?,TinhTrang= ? WHERE MaDT = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(11,ma);
				ps.setString(1,ten);
				ps.setString(2,mahang);
				ps.setString(3,mau);
				ps.setDouble(4,gia);
				ps.setString(5,manhinh);
				ps.setString(6,CPU);
				ps.setString(7,bonhotrong);
				ps.setString(8,camera);
				ps.setString(9,image);
				ps.setBoolean(10,tinhtrang);
				ps.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
		
		public void UpdateHang(String ma,String ten) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "UPDATE hang SET TenHang=? WHERE MaHang = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(2,ma);
				ps.setString(1,ten);
				ps.executeUpdate();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
		public E_DienThoai getDTByID(String ma) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			E_DienThoai dt = new E_DienThoai();
			String sql = "select * from dienthoai where MaDT = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1,ma);
				rs = ps.executeQuery();
				while(rs.next()) {
					dt = new E_DienThoai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10),rs.getBoolean(11));
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return dt;
	}
		public E_Hang getHangByMaHang(String mahang) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			E_Hang hang = new E_Hang();
			String sql = "select * from hang where MaHang = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1,mahang);
				rs = ps.executeQuery();
				while(rs.next()) {
					hang = new E_Hang(rs.getString(1), rs.getString(2));
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return hang;
	}
		
		public void DeleteDT(String ma) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "delete from dienthoai where MaDT = ?";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1,ma);
				
				ps.executeUpdate();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}
		public void addGioHang(String madt, int soluong) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			//String sql = "INSERT INTO hang VALUES(?,?)";
			String sql = "insert into giohang(MaDT, soluong) values(?, ?)";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, madt);
				ps.setInt(2, soluong);
				ps.executeUpdate();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		public ArrayList<E_Mua> getGioHang() {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "select TenDT, soluong, Gia*soluong, Image, giohang.MaDT from dienthoai join giohang where dienthoai.MaDT = giohang.MaDT;";
			try {
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				int i=0;
				while(rs.next()) {
					System.out.println(i++);
					listMua.add(new E_Mua(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getString(4), rs.getString(5)));	
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return listMua;
		}
		
		public void deleteGioHang(String madt, int soluong) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "delete from giohang where MaDT=? and soluong=? limit 1";
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, madt);
				ps.setInt(2, soluong);
				ps.executeUpdate();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		public void deleteAllGioHang() {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "delete from giohang";
			try {
				ps = conn.prepareStatement(sql);
				ps.executeUpdate();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void createHoaDon(String hoten, boolean gioitinh, String sdt, String diachi, String yeucau, 
								String strmadt, String strsoluong) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "insert into khachhang(HoTen, GioiTinh, SDT, DiaChi, YeuCau, ArrMaDT, ArrSoLuong) values(?, ?, ?, ?, ?, ?, ?)";
			try {
				ps= conn.prepareStatement(sql);
				ps.setString(1, hoten);
				ps.setBoolean(2, gioitinh);
				ps.setString(3, sdt);
				ps.setString(4, diachi);
				ps.setString(5, yeucau);
				ps.setString(6, strmadt);
				ps.setString(7, strsoluong);
				ps.executeUpdate();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		public ArrayList<E_DienThoai> searchByName(String mahang) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "select * from dienthoai";
			if (mahang.equals("1"))
				sql = "SELECT * FROM qldt.dienthoai order by Gia asc";
			else if (mahang.equals("2"))
				sql = "SELECT * FROM qldt.dienthoai order by Gia desc";
			else
				sql = "select * from dienthoai where MaHang='" + mahang + "'";
			try {
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				int i=0;
				while(rs.next()) {
					System.out.println(i++);
					listDT.add(new E_DienThoai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10),rs.getBoolean(11))) ;
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return listDT;
		}
		
		public ArrayList<E_DienThoai> searchByPrice(String index) {
			DBConnect connect = new DBConnect();
			Connection conn = connect.connect();
			String sql = "select * from dienthoai";
			if (index.equals("1"))
				sql = "SELECT * FROM dienthoai where gia <= 1000000";
			else if (index.equals("2"))
				sql = "SELECT * FROM dienthoai where gia >= 1000000 and gia <= 2000000";
			else
				sql = "SELECT * FROM dienthoai where gia >= 2000000";
			try {
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				int i=0;
				while(rs.next()) {
					System.out.println(i++);
					listDT.add(new E_DienThoai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(10),rs.getBoolean(11))) ;
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return listDT;
		}
}
