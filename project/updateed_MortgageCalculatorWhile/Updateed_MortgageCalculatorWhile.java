import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Updateed_MortgageCalculatorWhile {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print(" enter your salary :");
        double salary = scanner.nextDouble();
        System.out.print(" enter you credit score rage 0 to 500 :");
        int creditScore = scanner.nextInt();
        System.out.print("have you any criminal record? true/false :");
        boolean criminalrecord = scanner.nextBoolean();

        if(salary>40000 && creditScore>=0 && creditScore<=500 && !criminalrecord){
            if(creditScore>=300 && creditScore<500){
            
            System.out.print("Input loan amount:");
            double p = scanner.nextDouble();
            System.out.print("Input loan interest:");
            double r = scanner.nextDouble();
            System.out.print("Input years for loan: ");
            double numberYears = scanner.nextDouble();
            double r1 =(r/100)/12;
            int n = (int) numberYears * 12;
            double a = 1+r1;
            double powerResult = Math.pow(a,n);
            double mortgage_Pamyent = p*((r1*powerResult)/(powerResult-1));
            

            Locale bdlocal = Locale.of("en","bd");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdlocal);
            String mortgagePaymentFormatted = currencyFormatter.format(mortgage_Pamyent);

              System.out.println("mortgage_Pamyent= " + mortgagePaymentFormatted);}
            else{
                System.out.println("your credit score is low it must be >=300");}
        } 
        
        else{
            System.out.println("you are not eligible for loan");
        }
    scanner.close();
    }

}
