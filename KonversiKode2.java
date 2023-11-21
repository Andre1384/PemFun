import java.util.Scanner;
	
	public class KonversiKode2 {
		
		public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Masukkan kode negara = " );
		String KodeNegara = sc.nextLine();
		
		switch (KodeNegara) {
			case "ES" :
				System.out.println(KodeNegara + " Merupakan kode negara dari Spain");
				break;
			case "TN" :
				System.out.println(KodeNegara + " Merupakan kode negara dari Tunisia");
				break;
			case "ID" :
				System.out.println(KodeNegara + " Merupakan kode negara dari Indonesia");
				break;
			case "MM" :
				System.out.println(KodeNegara + " Merupakan kode negara dari Myanmar");
				break;
			case "IN" :
				System.out.println(KodeNegara + " Merupakan kode negara dari India");
				break;
			default:
				System.out.println("Mohon maaf, kode negara tersebut tidak dapat diketahui");
		}
	}
}