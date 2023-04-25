package lab2;
import java.util.Scanner;
public class exercise3 {
public static void main(String[] args) {
	System.out.print("Hãy nhập một số nguyên dương bất kỳ N = ");
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	System.out.print("Danh sách số nguyên tố từ 1 tới N là:  ");
	int x = 0;
	for(int i = 1; i<=N; i++) {
		int num = 0;
		for(int j = 2; j < i; j++) {if(i%j == 0) { num++;}};
		if(num == 0) {System.out.print(i + " ");x++;};
	}
	System.out.println();
	System.out.println("Số các số nguyên tố từ 1 tới N là:  " + x);

}
}
