import java.util.Scanner;

public class IT24300015Lab4Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        
       
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks. :");
            return;
        }
        
       
        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        
       
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab marks :");
            return;
        }
        
       
        System.out.print("Enter the percentage taken from exam marks: ");
        double examPercentage = scanner.nextDouble();
        
       
        System.out.print("Enter the percentage taken from lab marks: ");
        double labPercentage = scanner.nextDouble();
        
       
        if (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages. The total percentage must equal 100.");
            return;
        }
        
      
        double finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        
       
        System.out.println("The final marks for the module are: " + finalMarks);
    }
}
