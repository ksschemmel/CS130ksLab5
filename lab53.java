import java.util.Scanner;
import java.text.DecimalFormat;
public class lab53 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the first x coordinate: ");
			int x1 = scan.nextInt();
			System.out.println("Enter the first y coordinate: ");
			int y1 = scan.nextInt();
			System.out.println("Enter the second x coordinate: ");
			int x2 = scan.nextInt();
			System.out.println("Enter the second y coordinate: ");
			int y2 = scan.nextInt();
			double d=Math.sqrt(Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2)));
			DecimalFormat a = new DecimalFormat("0.##");
			System.out.println("the distance between the points are: " + a.format(d));
		}
		
	
	}

}
