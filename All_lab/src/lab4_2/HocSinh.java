package lab4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class HocSinh extends Person implements HienThi{
	private String TKB_HS;
	private String GVCN;
	private String Lop;
	

	public String getTKB_HS() {
		return TKB_HS;
	}

	public String getGVCN() {
		return GVCN;
	}

	public String getLop() {
		return Lop;
	}

	public void setTKB_HS(String tKB_HS) {
		TKB_HS = tKB_HS;
	}

	public void setGVCN(String gVCN) {
		GVCN = gVCN;
	}

	public void setLop(String lop) {
		Lop = lop;
	}
	
	ArrayList<HocSinh> hocsinhList = new ArrayList<>();

	public  void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		HocSinh hs = new HocSinh();
		System.out.print("Nhập họ tên: ");   hs.setHoTen(scanner.nextLine());
		System.out.print("Nhập giới tính: "); hs.setGioiTinh(scanner.nextLine());
		System.out.print("Nhập quê quán: "); hs.setQueQuan(scanner.nextLine()); 
		System.out.print("Nhập năm sinh: "); hs.setNamSinh(Integer.parseInt(scanner.nextLine()));
		System.out.print("Nhập thời khóa biểu: ");  hs.setTKB_HS(scanner.nextLine()); 
		System.out.print("Nhập tên giáo viên chủ nhiệm: "); hs.setGVCN(scanner.nextLine());
		System.out.print("Nhập lớp: "); hs.setLop(scanner.nextLine());
		hocsinhList.add(hs);
		}	
		
		// Định nghĩa thông tin cơ bản
	public  void hienThiThongTin() {
		System.out.println("Họ tên: "+ hocsinhList.get(0).getHoTen() +"\nGiới tính: "+hocsinhList.get(0).getGioiTinh() +"\nQuê quán: "+ hocsinhList.get(0).getQueQuan() +"\nNăm sinh: "+hocsinhList.get(0).getNamSinh());
		}
		
	public void hienThiThoKhoaBieu() {
		System.out.println("Thời khóa biểu: "+ hocsinhList.get(0).TKB_HS);	
	}
	public void hienThiThongTinLop() {
		System.out.println("Lớp: " + hocsinhList.get(0).getLop());
	};
}

