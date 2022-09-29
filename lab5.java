import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner; 
public class lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat n = NumberFormat.getCurrencyInstance();
		NumberFormat Percent = NumberFormat.getPercentInstance();
		NumberFormat n1 = NumberFormat.getCurrencyInstance(Locale.US);
		double value = 2.99;
		System.out.println("oil price of Kentucky is: " + n1.format(value));
		Scanner scan = new Scanner(System.in);
		double n2 = .1;
		System.out.println("The oil price has increased by " + Percent.format(n2) + " than last year");
		
	}

}
