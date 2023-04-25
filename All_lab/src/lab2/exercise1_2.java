package lab2;

import java.util.Scanner;
import java.lang.Math;

public class exercise1_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chúng tôi sẽ giúp bạn giải phương trình ax2 + bx + c = 0, Đầu tiên hãy");
		System.out.print("Nhập tham số a = ");
		float a = scanner.nextFloat();
		System.out.print("Nhập tham số b = ");
		float b = scanner.nextFloat();
		System.out.print("Nhập tham số c = ");
		float c = scanner.nextFloat();
		float delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm!");
		} else if (delta == 0) {
			System.out.println("Phương trình có 1 nghiệm duy nhất: x = " + -b / (2 * a));
		} else {
			float x1 = (float) (-b - Math.sqrt(delta)) / (2 * a);
			float x2 = (float) (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("Phương trình có 2 nghiệm là x1 = " + x1 + " và x2 = " + x2);
		}
	}
}
