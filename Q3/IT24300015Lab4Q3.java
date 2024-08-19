import java.util.Scanner;
	public class IT24300015Lab4Q3 {

	public static void main(String[] args){	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the number: ");
	double number = scanner.nextDouble();

	String result = (number > 0) ? "The number is positive."
	        :(number < 0) ? "The number is negative."
                :"The number is zero.";

	System.out.println(result);

	}

}