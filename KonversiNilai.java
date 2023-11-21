import java.util.Scanner;
	
	public class KonversiNilai {
		
		public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Masukkan nilai yang ingin dikonversi = " );
		char Alphabet = sc.next().charAt(0);
		
		if (Alphabet == 'A') {
			System.out.println("Konversi nilai " + Alphabet + " = 4.0"); 
		} else if (Alphabet == 'B') {
			System.out.println("Konversi nilai " + Alphabet + " = 3.0");
		} else if (Alphabet == 'C') {
			System.out.println("Konversi nilai " + Alphabet + " = 2.0");
		} else if (Alphabet == 'D') {
			System.out.println("Konversi nilai " + Alphabet + " = 1.0");
		} else if (Alphabet == 'E') {
			System.out.println("Konversi nilai " + Alphabet + " = 0");
		} else {
			System.out.println("Mohon maaf, konversi nilai tidak dapat diketahui");
			System.out.println("Silahkan mencoba kembali");
		}
	}
}