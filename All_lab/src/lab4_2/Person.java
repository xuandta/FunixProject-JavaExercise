package lab4_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	protected String HoTen;
	protected String GioiTinh;
	protected String QueQuan;
	protected int NamSinh;
	ArrayList<Person> personList = new ArrayList<>();
	public String getHoTen() {
		return HoTen;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public String getQueQuan() {
		return QueQuan;
	}
	public int getNamSinh() {
		return NamSinh;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public void setQueQuan(String queQuan) {
		QueQuan = queQuan;
	}
	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}


	// Nhập thông tin cơ bản
	public  void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		Person p = new Person();
		System.out.print("Nhập họ tên: ");   p.setHoTen(scanner.nextLine());
		System.out.print("Nhập giới tính: "); p.setGioiTinh(scanner.nextLine());
		System.out.print("Nhập quê quán: "); p.setQueQuan(scanner.nextLine()); 
		System.out.print("Nhập năm sinh: "); p.setNamSinh(Integer.parseInt(scanner.nextLine()));
		personList.add(p);
	}	
	
	// Định nghĩa thông tin cơ bản
	public  void hienThiThongTin() {
		System.out.println("Họ tên: "+ personList.get(0).getHoTen() +"\ngiới tính: "+personList.get(0).getGioiTinh() +"\nquê quán: "+ personList.get(0).getQueQuan() +"\năm sinh: "+personList.get(0).getNamSinh());
	}
	
	
}
