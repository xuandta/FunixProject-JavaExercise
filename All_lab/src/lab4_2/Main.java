package lab4_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		GiaoVien gv = new GiaoVien();
		NhanVien nv = new NhanVien();
		LopHoc lh = new LopHoc();
		Person ps = new Person();
		
		System.out.println("******************** Nhập thông tin Lớp ******************");
		lh.nhapThongTinLop();
		System.out.println("******************** Nhập thông tin Giáo viên ******************");
		gv.nhapThongTin();
		System.out.println("******************** Nhập thông tin Học Sinh ******************");
		hs.nhapThongTin();
		System.out.println("******************** Nhập thông tin Nhân viên ******************");
		nv.nhapThongTin();
		nv.nhapThongTinBoSung();
		System.out.println("******************** Hiển thị thông tin cơ bản của Lớp ******************");
		lh.hienThiThongTinLop();
		System.out.println("******************** Hiển thị thông tin cơ bản của Giáo viên ******************");
		gv.hienThiThongTin();
		System.out.println("******************** Hiển thị thông tin cơ bản của Học sinh ******************");
		hs.hienThiThongTin();
		System.out.println("******************** Hiển thị thông tin cơ bản của Nhân viên ******************");
		nv.hienThiThongTin();
		System.out.println("******************** Hiển thị thông tin TKB và lớp của Giáo Viên ******************");
		gv.hienThiThoKhoaBieu();
		gv.hienThiThongTinLop();
		System.out.println("******************** Hiển thị thông tin TKB và lớp của Học Sinh ******************");
		hs.hienThiThoKhoaBieu();
		hs.hienThiThongTinLop();
		

//		System.out.println("******************** Nhập thông tin Nhân viên ******************");
//		nv.nhapThongTin();
//		nv.nhapThongTinBoSung();
//		System.out.println("******************** Hiển thị thông tin cơ bản của Nhân viên ******************");
//		nv.hienThiThongTin();
//		gv.nhapThongTin();
//		gv.hienThiThongTin();
//		gv.hienThiThoKhoaBieu();
//		gv.hienThiThongTinLop();
		
		
//		Scanner scanner = new Scanner(System.in);
//		try {
//		System.out.println("Nhập thông tin Lớp Học:");
//		lh.nhapThongTinLop(scanner);
//
//		System.out.println("Nhập thông tin Học Sinh:");
//		hs.nhapThongTin(scanner);
//		hs.nhapThongTinHS(scanner);
//		
//		System.out.println("Nhập thông tin Giáo Viên");
//		gv.nhapThongTin(scanner);
//		gv.nhapThongTinGV(scanner);
//		
//		System.out.println("Nhập thông tin Nhân Viên");
//		nv.nhapThongTin(scanner);
//		nv.nhapThongTinNV(scanner);
//		
//		System.out.print("Hiển thị thông tin cơ bản của Lớp: ");
//		lh.hienThiThongTinLop();
//		System.out.print("Hiển thị thông tin cơ bản của Học sinh: ");
//		hs.hienThiThongTin();
//		System.out.print("Hiển thị thông tin cơ bản của Giáo Viên: ");
//		gv.hienThiThongTin();
//		System.out.print("Hiển thị thông tin cơ bản của Nhân Viên: ");
//		nv.hienThiThongTin();
//		
//		System.out.print("Thời khóa biểu của học sinh: ");
//		hs.hienThiThoKhoaBieu();
//		System.out.print("Lớp của học sinh: ");
//		hs.hienThiThongTinLop();
//		System.out.print("Thời khóa biểu của giáo viên: ");
//		gv.hienThiThoKhoaBieu();
//		System.out.print("Lớp của giáo viên: ");
//		gv.hienThiThongTinLop();
//		} catch (NumberFormatException e) {
//			System.out.println("Nhập thông tin sai định dạng, thông tin cần nhập phải là số nguyên");
//		}
	};
	
	
}
