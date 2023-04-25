package lab4_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercise1 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số thực a = ");
		float  a = sc.nextFloat();
		System.out.print("Nhập số thực b = ");	
		float b = sc.nextFloat();
		if( b == 0){
			throw new ArithmeticException();
		};
		System.out.println("Phần nguyên của phân số a/b là: "+(int)(a/b));
		}
		catch(InputMismatchException e) {System.out.println("Số bạn nhập không phải số thực");}
		catch (ArithmeticException e) {System.out.println("Không thể thực hiện phép chia cho 0");}
}
}
