package lab4_2;

import java.util.Scanner;

public class LopHoc {
	private String tenlop;
	private int siSo;
	private int khoi;
	
	public  void nhapThongTinLop() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập tên lớp: ");  tenlop = scanner.nextLine();
		System.out.print("Nhập tên sĩ số: "); siSo = Integer.parseInt(scanner.nextLine());
		System.out.print("Nhập khối: "); khoi = Integer.parseInt(scanner.nextLine());
	}
	
	public  void hienThiThongTinLop() {
		System.out.println("Tên lớp: " + tenlop+ "\nSĩ số: "+siSo+"\nKhối: "+khoi);
	}
}
