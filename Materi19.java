import java.util.Scanner;

public class Materi19 {
    static double fahr (double c) {
        return c * 1.8 + 32;
    }
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
    }
}