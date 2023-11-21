import static java.lang.System.out;
import java.util.Scanner;

public class Pin4 {

	public static void main(String args[]) {
		
		int PIN = 1384;
		int percobaan = 0;
		int maxPercobaan = 3;
		
	Scanner sc = new Scanner(System.in);
	while(percobaan < maxPercobaan) {
		out.println("Masukkan PIN Anda (4 digit): ");
	int input = sc.nextInt();
	
	if(input == PIN) {
		out.println("PIN anda benar. Akses diberikan.");
		break;
	} else {
		out.println("PIN yang anda masukkan salah. Silahkan masukkan  PIN anda kembali");
		out.println("Sisa kesempatan anda: " + (maxPercobaan - percobaan - 1));
	percobaan++;
		}
	}
	
	if (percobaan == maxPercobaan) {
		out.println("Kesempatan anda telah habis. Akses akan diblokir");
		}
	}
}