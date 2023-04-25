package lab2;
import java.util.Scanner;
public class exercise1_1 {
public static void main(String[] args) {
	System.out.print("Nhập một năm bất kỳ N = ");
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();	
	if(N%400 == 0 || (N%4 == 0 && N%100 !=0)) {System.out.println("Đây là năm nhuận");}
	else {System.out.println("Đây không phải là năm nhuận");}
}
}
