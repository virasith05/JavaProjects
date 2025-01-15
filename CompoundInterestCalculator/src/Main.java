import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double p= scanner.nextInt();
        System.out.print("Enter Interest rate(in %): ");
        double r= scanner.nextDouble()/100;
        System.out.print("Enter the no of times compounded per year: ");
        int t= scanner.nextInt();
        System.out.print("Enter the no of years: ");
        int n= scanner.nextInt();
        double f=p * Math.pow( (1+(r/n)),(n*t));
        System.out.printf("Total Amount is: %.2f",f);
        scanner.close();
    }
}
