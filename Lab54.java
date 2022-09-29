import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side A: ");
		int a = scan.nextInt();
		System.out.println("Enter the length of side B: ");
		int b = scan.nextInt();
		System.out.println("Enter the length os side c: ");
		int c = scan.nextInt();
		int S = (a+b+c)/ 2;
		Double A =Math.sqrt(S*(S-a)*(S-b)*(S-c));
		DecimalFormat X = new DecimalFormat("0.##");
		System.out.println("The area of the equation is: " + X.format(S));
		
		
		
		}

}
