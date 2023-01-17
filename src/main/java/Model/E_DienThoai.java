package Model;

public class E_DienThoai {
	private String  MaDT;
	private String TenDT;
	private String MaHangDT;
	private String Mau;
	private Double Gia;
	private String ManHinh;
	private String CPU;
	private String BoNhoTrong;
	private String Camera;
	private String Image;
	private Boolean TinhTrang;	
	
	public E_DienThoai() {
		
	}
	
	public E_DienThoai(String ma,String ten,String mahang,String mau,Double gia,String manhinh,String CPU,String bonhotrong,String camera,String image,Boolean tt) {
		this.MaDT = ma;
		this.TenDT = ten;
		this.MaHangDT = mahang;
		this.Mau=mau;
		this.Gia = gia;
		this.ManHinh =manhinh; 
		this.CPU = CPU;
		this.BoNhoTrong =bonhotrong;
		this.Camera =camera;
		this.Image = image;
		this.TinhTrang = tt;
	}

	public String getMaDT() {
		return MaDT;
	}

	public void setMaDT(String maDT) {
		MaDT = maDT;
	}

	public String getTenDT() {
		return TenDT;
	}

	public void setTenDT(String tenDT) {
		TenDT = tenDT;
	}

	public String getMaHangDT() {
		return MaHangDT;
	}

	public void setMaHangDT(String mahangDT) {
		MaHangDT = mahangDT;
	}

	public String getMau() {
		return Mau;
	}

	public void setMau(String mau) {
		Mau = mau;
	}

	public Double getGia() {
		return Gia;
	}

	public void setGia(Double gia) {
		Gia = gia;
	}

	public String getManHinh() {
		return ManHinh;
	}

	public void setManHinh(String manHinh) {
		ManHinh = manHinh;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getBoNhoTrong() {
		return BoNhoTrong;
	}

	public void setBoNhoTrong(String boNhoTrong) {
		BoNhoTrong = boNhoTrong;
	}

	public String getCamera() {
		return Camera;
	}

	public void setCamera(String camera) {
		Camera = camera;
	}

	public Boolean isTinhTrang() {
		return TinhTrang;
	}

	public void setTinhTrang(Boolean tinhTrang) {
		TinhTrang = tinhTrang;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}
}
