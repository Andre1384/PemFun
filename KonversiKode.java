import java.util.Scanner;
	
	public class KonversiKode {
		
		public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Masukkan kode negara = " );
		
		String KodeNegara = sc.nextLine();
		
		if (KodeNegara.equals("ES")) {
			System.out.println(KodeNegara + " Merupakan kode negara dari Spain"); 
		} else if (KodeNegara.equals("TN")) {
			System.out.println(KodeNegara + " Merupakan kode negara dari Tunisia");
		} else if (KodeNegara.equals("ID")) {
			System.out.println(KodeNegara + " Merupakan kode negara dari Indonesia");
		} else if (KodeNegara.equals("MM")) {
			System.out.println(KodeNegara + " Merupakan kode negara dari Myanmar");
		} else if (KodeNegara.equals("IN")) {
			System.out.println(KodeNegara + " Merupakan kode negara dari India");
		} else {
			System.out.println("Mohon maaf, kode negara tidak dapat diketahui");
			System.out.println("Silahkan mencoba kembali");
		}
	}
}