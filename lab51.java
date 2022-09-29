import java.util.Random;
public class lab51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int randNum = generator.nextInt(16) + 5;
		System.out.println("a random number between 5-20: " + randNum);
	}

}
