package lab3_2;

public class Nhanvien {
	private int ID;
	private String HoTen;
	private String GioiTinh;
	private int NamSinh;
	private String QueQuan;
	private String TenPhongBan;
	private int Luong;
	public Nhanvien(int iD, String hoTen, String gioiTinh, int namSinh, String queQuan, String tenPhongBan, int luong) {
		this.ID = iD;
		this.HoTen = hoTen;
		this.GioiTinh = gioiTinh;
		this.NamSinh = namSinh;
		this.QueQuan = queQuan;
		this.TenPhongBan = tenPhongBan;
		this.Luong = luong;
	}
	public int getID() {
		return ID;
	}
	public String getHoTen() {
		return HoTen;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public int getNamSinh() {
		return NamSinh;
	}
	public String getQueQuan() {
		return QueQuan;
	}
	public String getTenPhongBan() {
		return TenPhongBan;
	}
	public int getLuong() {
		return Luong;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}
	public void setQueQuan(String queQuan) {
		QueQuan = queQuan;
	}
	public void setTenPhongBan(String tenPhongBan) {
		TenPhongBan = tenPhongBan;
	}
	public void setLuong(int luong) {
		Luong = luong;
	}
	
}
