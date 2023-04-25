package lab2;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int lastN;
		do {
			System.out.print("Nhập vào số nguyên N = "); int N = sc.nextInt();
			sum += N;
			lastN = N;
		} while(sum <= 100);
		System.out.println("Tổng các số đã nhập của bạn đã lớn hơn 100. Số N cuối cùng bạn nhập là N = "+lastN);
		if(lastN % 2 ==0) {
			System.out.print("Dãy số chẵn giảm dần từ N về 1 là: ");
			for(int i = lastN; i>= 1; i -= 2) {System.out.print( i + "  ");}
		}
		else {
			System.out.print("Dãy số lẻ giảm dần từ N về 1 là: ");
			for(int i = lastN; i>= 1; i -= 2) {System.out.print( i + "  ");}		
		}
	}
}
