import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double newtemp;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Hello, This is Temperature Converter Program");
        System.out.print("Enter the temperature: ");
        double temp= scanner.nextDouble();
        System.out.print("Convert to C or F: ");
        String unit= scanner.next().toUpperCase();

        newtemp=unit.equals("C") ? (temp-32)*5/9 : (temp*5/9)+32;
        System.out.printf("New Temp is: %.2f %s",newtemp,unit);
        scanner.close();


    }
}
