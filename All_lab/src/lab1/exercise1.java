package lab1;
import java.util.Scanner;
import java.lang.Math;
public class exercise1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhập chiều dài cạnh thứ nhất của tam giác: ");
	int a = scanner.nextInt();
	System.out.print("Nhập chiều dài cạnh thứ hai của tam giác: ");
	int b = scanner.nextInt();		
	System.out.print("Nhập chiều dài cạnh thứ ba của tam giác: ");
	int c = scanner.nextInt();
	float p =(float)(a+b+c)/2;
	float s =(float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
	System.out.println("Chu vi của tam giác này = " + (int)(2*p));
	System.out.println("Diện tích của tam giác này = " + s);
}
}
	
