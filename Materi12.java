import  java.util.Scanner;

	public class Materi12 {
    public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
        sum += num--;
        }
		System.out.println(sum);
    }

}