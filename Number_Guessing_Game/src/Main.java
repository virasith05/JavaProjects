import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);


        System.out.println("Hello, This is a number guessing game");
        int guess=0;
        int attempts=0;
        System.out.print("Enter the min number: ");
        int min= scanner.nextInt();
        System.out.print("Enter the max number: ");
        int max= scanner.nextInt();
        int number= random.nextInt(min,max+1);
        System.out.printf("Enter a number between %d-%d:\n",min,max);

        do {
            System.out.print("Enter a guess: ");
            guess= scanner.nextInt();
            attempts++;

            if (number>guess){
                System.out.println("It has to be high");
            }
            else if (number<guess){
                System.out.println("It has to be low");
            }

        }while(guess!=number);
        System.out.println("You have won");
        System.out.println("No of attempts: "+attempts);
    }
}
