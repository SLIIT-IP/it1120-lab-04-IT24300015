import java.util.Scanner;
	public class IT24300015Lab4Q1 {

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the number: ");
	double number = scanner.nextDouble();
	
	if (number > 0) {
		System.out.println("The number is positive: ");
	} else if (number < 0) {
		System.out.println("The number is negative: ");
	} else {
		System.out.println("The number is zero: ");
	}

    }

}		