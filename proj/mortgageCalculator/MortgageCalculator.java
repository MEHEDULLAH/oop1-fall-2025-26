import java.util.Scanner;

public class MortgageCalculator {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input:");
        double p = scanner.nextDouble();
        double r = scanner.nextDouble();
        double numberYears = scanner.nextDouble();
        int n = (int) numberYears * 12;
        double a = 1+r;
        double powerResult = Math.pow(a,n);
        double mortgage_Pamyent = p*((r*powerResult)/(powerResult-1));
        
        System.out.println("mortgage_Pamyent= " + mortgage_Pamyent);

        scanner.close();
    }    
}
