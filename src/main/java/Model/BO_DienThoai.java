package Model;

import java.util.ArrayList;

public class BO_DienThoai {
	DAO_DientThoai dao = new DAO_DientThoai();
	
	public ArrayList<E_DienThoai > getAllDT(){
		return dao.getAllDT();
	}
	public ArrayList<E_Hang > getAllHang(){
		return dao.getAllHang();
	}
	public ArrayList<E_DienThoai> getAllDTByTimkiem(String txt){
		return dao.getAllDTByTimkiem(txt);
	}
	public ArrayList<E_Hang> getAllHangByTimkiem(String txt){
		return dao.getAllHangByTimkiem(txt);
	}
	public void AddDT(String ma,String ten,String mahang,String mau,Double gia,String manhinh,String CPU,String bonhotrong,String camera,String image,Boolean tinhtrang) {
		dao.AddDT(ma, ten, mahang, mau, gia, manhinh, CPU, bonhotrong, camera,image, tinhtrang);
	}
	public void AddHang(String ma,String ten) {
		dao.AddHang(ma, ten);
	}
	public void Update(String ma,String ten,String mahang,String mau,Double gia,String manhinh,String CPU,String bonhotrong,String camera,String image,Boolean tinhtrang) {
		dao.UpdateDT(ma, ten, mahang, mau, gia, manhinh, CPU, bonhotrong, camera,image, tinhtrang);
	}
	public void UpdateHang(String ma,String ten) {
		dao.UpdateHang(ma, ten);
	}
	public E_DienThoai getDTByID(String ma) {
		return dao.getDTByID(ma);
	}
	public E_Hang getHangByMaHang(String mahang) {
		return dao.getHangByMaHang(mahang);
	}
	public void DeleteDT(String ma) {
		dao.DeleteDT(ma);
	}
	public void addGioHang(String madt, int soluong)
	{
		dao.addGioHang(madt, soluong);
	}
	public ArrayList<E_Mua> getGioHang()
	{
		return dao.getGioHang();
	}
	public void deleteGioHang(String madt, int soluong)
	{
		dao.deleteGioHang(madt, soluong);
	}
	public void deleteAllGioHang()
	{
		dao.deleteAllGioHang();
	}
	public void createHoaDon(String hoten, boolean gioitinh, String sdt, String diachi, String yeucau, 
			String strmadt, String strsoluong)
	{
		dao.createHoaDon(hoten, gioitinh, sdt, diachi, yeucau, strmadt, strsoluong);
	}
	public ArrayList<E_DienThoai> searchByName(String mahang)
	{
		return dao.searchByName(mahang);
	}
	public ArrayList<E_DienThoai> searchByPrice(String index)
	{
		return dao.searchByPrice(index);
	}
}
