package lab3_1;
import java.util.Scanner;
public class exercise1 {
public static void main(String[] args) {
	System.out.print("Nhập vào số phần tử N = ");
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	int arr[] = new int [N];
	for(int i=0;i<N;i++) {
		System.out.print("Nhập vào phần tử thứ " + (i+1) + " là N" + (i+1) + " = ");
		int Ni = scanner.nextInt();
		arr[i] = Ni; 
	};
	for(int i = 0; i<N; i++) {
		for(int j = i; j < N; j++)
		if(arr[j] < arr[i]) {
			int m = arr[j];
			arr[j] = arr[i];
			arr[i] = m;}
	}
	System.out.print("Dãy số từ nhỏ đến lớn là: " );
	for (int i = 0; i<N; i++) {System.out.print(arr[i] + " ");}
}
}
