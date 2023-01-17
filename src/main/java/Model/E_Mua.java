package Model;

public class E_Mua {
	private String TenDT;
	private int SoLuong;
	private double TongGia;
	private String Image;
	private String MaDT;
	
	public E_Mua() {}
	public E_Mua(String _TenDT, int _SoLuong, double _TongGia, String _Image, String _MaDT) 
	{
		this.TenDT = _TenDT;
		this.SoLuong = _SoLuong;
		this.TongGia = _TongGia;
		this.Image = _Image;
		this.MaDT = _MaDT;
	}
	
	public String getTenDT()
	{
		return this.TenDT;
	}
	public void setTenDT(String _TenDT)
	{	
		this.TenDT = _TenDT;
	}
	
	public int getSoLuong()
	{
		return this.SoLuong;
	}
	public void setSoLuong(int _SoLuong)
	{ 
		this.SoLuong = _SoLuong;
	}
	
	public double getTongGia()
	{
		return this.TongGia;
	}
	public void setTongGia(double _TongGia)
	{
		this.TongGia = _TongGia;
	}
	
	public String getImage()
	{
		return this.Image;
	}
	public void setImage(String _Image)
	{
		this.Image = _Image;
	}
	
	public String getMaDT()
	{
		return this.MaDT;
	}
	public void setMaDT(String _MaDT)
	{
		this.MaDT = _MaDT;
	}
}
