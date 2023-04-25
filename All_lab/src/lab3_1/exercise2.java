package lab3_1;
import java.util.ArrayList;
import java.util.Scanner;
public class exercise2 {
	private String name;
	private int weight;
	public exercise2(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static void AnimalNangNhat (ArrayList<exercise2> listanimal) {
		int indexmax = 0;
		for(int i=0;i<listanimal.size();i++) {
			if(listanimal.get(i).getWeight()>listanimal.get(indexmax).getWeight()) {indexmax = i;}}
		System.out.println("Animal nặng nhất có tên là " + listanimal.get(indexmax).getName() +" với cân nặng là "+listanimal.get(indexmax).getWeight()+" kg");
		};

	public static void main(String[] args) {
		ArrayList<exercise2> listanimal = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng Animal sẽ nhập N = ");
		int N = sc.nextInt();
		for(int i=0; i<N;i++) {
			System.out.println("Nhập thông tin của Animal thứ " + (i+1));
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhập tên: ");
			String name = scanner.nextLine();
			System.out.print("Nhập cân nặng: ");
			int weight = scanner.nextInt();
			exercise2 Animal = new exercise2(name,weight);
			listanimal.add(Animal);
		};
		AnimalNangNhat(listanimal);
		
	}
}
