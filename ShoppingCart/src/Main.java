import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        System.out.println("Hello, welcome to KFC");
        Scanner scanner=new Scanner(System.in);
        System.out.print("May I know Which item u want to buy: ");
        String item=scanner.nextLine();
        System.out.print("The Price of each "+item+" is: ");
        double price= scanner.nextDouble();
        System.out.print("How many would u like to buy: ");
        int quantity=scanner.nextInt();
        double total=price*quantity;
        System.out.print("You have bought "+quantity+" "+item);
        System.out.println(" and your total bill is $"+total);

    }
}
