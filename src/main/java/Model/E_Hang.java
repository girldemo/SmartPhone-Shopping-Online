package Model;

public class E_Hang {
	private String MaHang;
	private String TenHang;
	
	public E_Hang() {}
	public E_Hang(String ma,String ten) {
		this.setMaHang(ma);
		this.setTenHang(ten);
	}
	public String getMaHang() {
		return MaHang;
	}
	public void setMaHang(String maHang) {
		MaHang = maHang;
	}
	public String getTenHang() {
		return TenHang;
	}
	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}
	
}
