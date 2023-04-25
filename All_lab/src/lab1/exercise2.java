package lab1;
import java.util.Scanner;
public class exercise2 {
	public float pi = 3.14f;
	public int R;
	public float chuvi () {
		float C = (float) 2*this.pi*this.R;
		return C;
	}
	public float dientich() {
		float S = (float) this.pi*this.R*this.R;
		return S;
	}
	public static void main(String[] args) {
		exercise2 ht = new exercise2();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập bán kính của hình tròn: ");
		ht.R = scanner.nextInt();
		System.out.println("Chu vi hình tròn này = " + ht.chuvi());
		System.out.println("Diện tích hình tròn này = " + ht.dientich());
	}
}
