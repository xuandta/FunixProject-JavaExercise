package lab4_2;

import java.util.ArrayList;
import java.util.Scanner;

	public class GiaoVien extends Person implements HienThi{
	private String Lop;
	private String Mon;
	private String TKB_GV;
	
	public String getLop() {
		return Lop;
	}

	public String getMon() {
		return Mon;
	}

	public String getTKB_GV() {
		return TKB_GV;
	}


	public void setLop(String lop) {
		Lop = lop;
	}

	public void setMon(String mon) {
		Mon = mon;
	}

	public void setTKB_GV(String tKB_GV) {
		TKB_GV = tKB_GV;
	}

	ArrayList<GiaoVien> gvList = new ArrayList<>();
	
	// Nhập thông tin cơ bản
	public  void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		GiaoVien gv = new GiaoVien();
		System.out.print("Nhập họ tên: ");   gv.setHoTen(scanner.nextLine());
		System.out.print("Nhập giới tính: "); gv.setGioiTinh(scanner.nextLine());
		System.out.print("Nhập quê quán: "); gv.setQueQuan(scanner.nextLine()); 
		System.out.print("Nhập năm sinh: "); gv.setNamSinh(Integer.parseInt(scanner.nextLine()));
		System.out.print("Nhập lớp: ");	gv.setLop(scanner.nextLine());
		System.out.print("Nhập tên bộ môn: ");	gv.setMon(scanner.nextLine());
		System.out.print("Nhập thời khóa biểu: "); gv.setTKB_GV(scanner.nextLine());
		gvList.add(gv);
	}	
	
	// Định nghĩa thông tin cơ bản
	public  void hienThiThongTin() {
		System.out.println("Họ tên: "+ gvList.get(0).getHoTen() +"\nGiới tính: "+gvList.get(0).getGioiTinh() +"\nQuê quán: "+ gvList.get(0).getQueQuan() +"\nNăm sinh: "+gvList.get(0).getNamSinh());
	}
	
	
	public void hienThiThoKhoaBieu() {
		System.out.println("Thời khóa biểu: " + gvList.get(0).getTKB_GV());	
	}
	public void hienThiThongTinLop() {
		System.out.println("Lớp: "+gvList.get(0).getLop());
	};


}
