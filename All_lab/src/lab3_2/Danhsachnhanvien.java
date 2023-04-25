package lab3_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Danhsachnhanvien {
	public static void XuatFileExcel(ArrayList<Nhanvien> data) throws IOException {
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet s1 = wk.createSheet("Danh sách nhân viên");
		XSSFRow rowtitle = s1.createRow(0);
		XSSFCell title1 = rowtitle.createCell(0);
		XSSFCell title2 = rowtitle.createCell(1);
		XSSFCell title3 = rowtitle.createCell(2);
		XSSFCell title4 = rowtitle.createCell(3);
		XSSFCell title5 = rowtitle.createCell(4);
		XSSFCell title6 = rowtitle.createCell(5);
		XSSFCell title7 = rowtitle.createCell(6);
		title1.setCellValue("Mã nhân viên");
		title2.setCellValue("Họ tên");
		title3.setCellValue("Giới tính");
		title4.setCellValue("Năm sinh");
		title5.setCellValue("Quê quán");
		title6.setCellValue("Tên phòng ban");
		title7.setCellValue("Lương");
		
		for(int i = 0; i < data.size(); i++) {
			Nhanvien nv = data.get(i);
			XSSFRow row = s1.createRow(i+1);
			row.createCell(0).setCellValue(nv.getID());
			row.createCell(1).setCellValue(nv.getHoTen());
			row.createCell(2).setCellValue(nv.getGioiTinh());
			row.createCell(3).setCellValue(nv.getNamSinh());
			row.createCell(4).setCellValue(nv.getQueQuan());
			row.createCell(5).setCellValue(nv.getTenPhongBan());
			row.createCell(6).setCellValue(nv.getLuong());
		}
		FileOutputStream out = new FileOutputStream("H:\\DSNhanvien.xlsx");
		wk.write(out);
		wk.close();
		
		System.out.println("Đã xuất file excel thành công");
	}
	
	
	public static void main(String[] args) throws IOException {
		ArrayList<Nhanvien> data = new ArrayList<>();
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Nhập số lượng nhân viên sẽ nhập là N = ");
		int N = sc1.nextInt();
		for (int i =0; i < N; i++) {
			System.out.println("Nhập thông tin nhân viên thứ: " + (i + 1));
			Scanner sc2 = new Scanner(System.in);
			System.out.print("Nhập họ tên: ");
			String hoten = sc2.nextLine();
			System.out.print("Nhập giới tính (Nam|Nữ): ");
			String gioitinh = sc2.nextLine();
			System.out.print("Nhập năm sinh: ");
			int namsinh = Integer.parseInt(sc2.nextLine()) ;
			System.out.print("Nhập quê quán: ");
			String quequan = sc2.nextLine();			
			System.out.print("Nhập tên phòng ban: ");
			String phongban = sc2.nextLine();			
			System.out.print("Nhập mức lương: ");
			int luong = Integer.parseInt(sc2.nextLine());		
			Nhanvien nv = new Nhanvien(i+1, hoten, gioitinh, namsinh, quequan, phongban, luong);
			data.add(nv);
		}
		XuatFileExcel(data);
	}
}
