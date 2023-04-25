package lab4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVien extends Person{
	private String PhongBan;
	private String ChucVu;

	public String getPhongBan() {
		return PhongBan;
	}

	public String getChucVu() {
		return ChucVu;
	}

	public void setPhongBan(String phongBan) {
		PhongBan = phongBan;
	}

	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}
	ArrayList<NhanVien> nhanvienList = new ArrayList<>();
	// Nhập thông tin cơ bản
	public  void nhapThongTinBoSung() {
		Scanner scanner = new Scanner(System.in);
		NhanVien nv = new NhanVien();
		System.out.print("Nhập tên phòng ban: ");  nv.setPhongBan(scanner.nextLine());
		System.out.print("Nhập chức vụ: "); setChucVu(scanner.nextLine());;
		nhanvienList.add(nv);
	}
	
	
}
