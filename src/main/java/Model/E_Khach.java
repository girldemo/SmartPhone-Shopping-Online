package Model;
import java.util.ArrayList;

public class E_Khach {
	private String HoTen;
	private boolean GioiTinh;
	private String SDT;
	private String DiaChi;
	private String YeuCau;
	private String ArrMaDT;
	private String ArrSoLuong;
	
	public E_Khach() {}
	
	public E_Khach(String HoTen, boolean GioiTinh, String SDT, String DiaChi, String YeuCau, 
					String ArrMaDT, String ArrSoLuong)
	{
		this.HoTen = HoTen;
		this.GioiTinh = GioiTinh;
		this.SDT = SDT;
		this.DiaChi = DiaChi;
		this.YeuCau = YeuCau;
		this.ArrMaDT = ArrMaDT;
		this.ArrSoLuong = ArrSoLuong;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public boolean getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		GioiTinh = gioiTinh;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public String getYeuCau() {
		return YeuCau;
	}

	public void setYeuCau(String yeuCau) {
		this.YeuCau = yeuCau;
	}

	public String getArrMaDT() {
		return ArrMaDT;
	}

	public void setArrMaDT(String arrMaDT) {
		this.ArrMaDT = arrMaDT;
	}

	public String getArrSoLuong() {
		return ArrSoLuong;
	}

	public void setArrSoLuong(String arrSoLuong) {
		this.ArrSoLuong = arrSoLuong;
	}
	
	
}