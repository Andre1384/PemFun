import java.util.Scanner;

public class Array1 {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Jumlah data yang akan di inputkan: ");
		
		int data = sc.nextInt();
		int data1[] = new int[data];
			System.out.println("Inputkan data-datanya: ");
		
		for(int n=0; n<data; n++) {
			System.out.print("Data ke-" + n + " : ");
			data1[n] = sc.nextInt();
		}
			
		for(int n=0; n<data; n++) {
			if (data1[n] % 2 != 0) {
				System.out.println(data1[n] + " --> Bilangan Ganjil ");
			} else {
				System.out.println(data1[n] + " --> Bilangan Genap ");
			}
		}
		
		int total = 0;
		for (int n=0; n<data; n++) {
			total = total + data1[n];
		}
			System.out.println("Jumlah total dari data tersebut adalah " + total);
		
		double rata = total/data;
			System.out.println("Rata-rata dari data tersebut adalah " + rata);
	}
}