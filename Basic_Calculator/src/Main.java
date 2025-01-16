import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        double a= scanner.nextDouble();
        System.out.print("Enter 2nd number: ");
        double b= scanner.nextDouble();

        System.out.print("Enter an operator to perform(+,-,*,/,^): ");
        char sel= scanner.next().charAt(0);

        switch (sel){
            case '+' -> System.out.println(a+b);
            case '-' -> System.out.println(a-b);
            case '*' -> System.out.println(a*b);
            case '/' -> {
                if (b==0){
                    System.out.println("Cannot divide by zero");
                }
                else {
                    System.out.println(a/b);
                }
            }
            case '^' -> System.out.println(Math.pow(a,b));
            default -> System.out.println("Enter a valid operator");
        }
        scanner.close();

    }
}
