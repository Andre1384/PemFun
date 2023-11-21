import java.util.Scanner;

public class Array2 {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
	
		int harga[] = {2500, 3000, 4000, 5000, 6000};
		int barang[] = new int[harga.length];
			System.out.println("Inputkan jumlah barang belanjaan: ");
		
			for(int n = 0; n < harga.length; n++) {
				System.out.print("Jumlah belanja item ke-" + n + " Rp." + harga[n] + " : ");
			barang[n] = sc.nextInt();
		}
				System.out.println("Berikut daftar belanja dan harga: ");
	
		int totalharbang = 0;
			for(int n = 0; n < harga.length; n++) {
			totalharbang = harga[n] * barang[n];
				System.out.println("Harga barang ke-" + n + ", Rp." + harga[n] + ", " + barang[n] + " item " + " : " + totalharbang);
		}		
	
		int totalrangbel = 0;
			for(int n = 0; n < harga.length; n++) {
			totalrangbel = totalrangbel + barang[n];
		}
				System.out.println("Total item belanja: " + totalrangbel);
		
		int totalbelanja = 0;
			for(int n = 0; n < harga.length; n++) {
			totalbelanja = totalbelanja + harga[n] * barang[n];
		}
				System.out.println("Total belanja: " + totalbelanja);
	}
}