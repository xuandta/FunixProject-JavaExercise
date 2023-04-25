package lab2;
import java.util.Scanner;
public class exercise4 {
public static void main(String[] args) {
	System.out.println("Gói nào trong java chứa lớp Scanner dùng để nhập dữ liệu từ bàn phím ?");
	System.out.println("A. java.net");
	System.out.println("B. java.io");
	System.out.println("C. java.util");
	System.out.println("D. java.awt");
	System.out.print("Câu trả lời của bạn là: ");
	Scanner scanner = new Scanner(System.in);
	String answer = scanner.nextLine();
	String right_answer = "C";
	if(answer.trim().toUpperCase().equals(right_answer)) {System.out.println("Câu trả lời chính xác!");}
	else {System.out.println("Câu trả lời chưa chính xác!");};
}
}
