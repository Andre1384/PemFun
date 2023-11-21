import  java.util.Scanner;

	public class Materi9 {
		public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		int celcius = sc.nextInt();
		if (celcius >= 100) {
		System.out.println("Boiling"); 
		} else {
		System.out.println("Not boiling"); 
        }
    }
}