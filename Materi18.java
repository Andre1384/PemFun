import java.util.Scanner;

public class Materi18 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double foot = sc.nextDouble(); 

        convert(foot); }
		static void convert( double foot) {
        System.out.println(foot * 12); 
	}
}