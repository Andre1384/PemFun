import java.util.Scanner;
	
	public class KonversiNilai2 {
		
		public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Masukkan nilai yang ingin dikonversi = " );
		char Alphabet = sc.next().charAt(0);
		
		switch (Alphabet) {
			case 'A' :
				System.out.println("Konversi nilai " + Alphabet + " adalah 4.0");
				break;
			case 'B' :
				System.out.println("Konversi nilai " + Alphabet + " adalah 3.0");
				break;
			case 'C' :
				System.out.println("Konversi nilai " + Alphabet + " adalah 2.0");
				break;
			case 'D' :
				System.out.println("Konversi nilai " + Alphabet + " adalah 1.0");
				break;
			case 'E' :
				System.out.println("Konversi nilai " + Alphabet + " adalah 0 ");
				break;
			default:
				System.out.println("Mohon maaf, konversi nilai tersebut tidak dapat diketahui");
		}
	}
}