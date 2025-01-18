import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){

        boolean exit=true;
        double balance=0;

        while (exit){
            System.out.println("----------------------------------------");
            System.out.println("Welcome to World Bank");
            System.out.println("1.Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter your choice for Banking(1-4): ");
            int choice= scanner.nextInt();

            switch (choice){
                case 1 -> balance(balance);
                case 2 -> balance=balance+deposit();
                case 3 -> balance= balance-withdraw(balance);
                case 4 -> exit=false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.println("Thank you for banking");
        scanner.close();
    }
    static void balance(double balance){
        System.out.printf("%.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter a amount to be deposited: ");
        amount=scanner.nextDouble();
        if (amount<0){
            System.out.println("Amount deposting cant be negative");
            return 0;
        }
        else {
            return amount;
        }


    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount= scanner.nextDouble();
        if (amount>balance){
            System.out.println("Insufficient Funds");
            return 0;
        } else if (amount<0) {
            System.out.println("Amount withdrawl cant be negative");
            return 0;

        } else {
            return amount;
        }

    }
}
