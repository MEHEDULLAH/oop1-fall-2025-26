import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class Updateed_MortgageCalculatorWhile {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(" enter your salary :");
            if(scanner.hasNextDouble()){
                 double salary = scanner.nextDouble();
                 if(salary>=40000){
                    break; 
                }
                 else{ System.out.println("your salary is low it must be >=40000");}
            }
            else{
                System.out.println("Invalid input. Please enter a numeric/number value for salary.");
               
            }
        }
        while(true){
            System.out.print(" enter you credit score rage 0 to 500 :");
            if(scanner.hasNextInt()){
                 int creditScore = scanner.nextInt();
                 if(creditScore>=0 && creditScore<=500){
                    break;
                 }
                 else{ System.out.println("your credit score is out of range it must be between 0 to 500");}
            }
                 
            else{
                System.out.println("Invalid input. Please enter an integer value for credit score."); }
            }
        while(true){
            System.out.print("have you any criminal record? true/false :");
            if(scanner.hasNextBoolean()){
                 boolean criminalrecord = scanner.nextBoolean();
                 if(!criminalrecord){
                    break;
                 }
                    else{ System.out.println("you are not eligible for loan due to criminal record");}
            }
            else{
                System.out.println("Invalid input. Please enter true or false for criminal record.");
            }
        }
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

              System.out.println("mortgage_Pamyent= " + mortgagePaymentFormatted);
           
             scanner.close();
    }

}
