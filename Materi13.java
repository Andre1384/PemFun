import java.util.Scanner;

	public class Materi13 { 
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        
			int number = scanner.nextInt();
			int factorial = 1;

			for(int x=1; x<=number; x++) {
            factorial *= x; }
			System.out.println(factorial);   
   }
}