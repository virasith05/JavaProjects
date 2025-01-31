import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    static Random random=new Random();
    public static void main(String[] args) {
        String[] choice={"\uD83C\uDF52","\uD83C\uDF4B","\uD83C\uDF4A","\uD83C\uDF49","\uD83C\uDF51"};
        boolean playagain=true;
        double balance;

        System.out.println("Welcome to Slot Game");
        System.out.println("Symbols: \uD83C\uDF52,\uD83C\uDF4B,\uD83C\uDF4A,\uD83C\uDF49,\uD83C\uDF51");
        System.out.print("How much u want to deposit: ");
        balance= scanner.nextDouble();
        System.out.println("Current Balance: "+balance);
        while (playagain){
            System.out.println("#####################");
            System.out.print("Do u want to play(yes/no): ");
            String yn= scanner.next().toLowerCase();
            switch (yn){
                case "yes" -> {
                    System.out.print("Place your bet amount: ");
                    double betamount=scanner.nextDouble();
                    if (betamount<=balance){
                        if (betamount==0){
                            System.out.println("Enter higher amount");
                        }
                        else {
                            System.out.println("Spinning.....");
                            String comChoice1 = choice[random.nextInt(5)];
                            String comChoice2 = choice[random.nextInt(5)];
                            String comChoice3 = choice[random.nextInt(5)];
                            System.out.println("#############");
                            System.out.print(comChoice1);
                            System.out.print(" | ");
                            System.out.print(comChoice2);
                            System.out.print(" | ");
                            System.out.println(comChoice3);
                            System.out.println("##############");

                            if (comChoice1.equals(comChoice2)){
                                if (comChoice2.equals(comChoice3)){
                                    System.out.println("You Win");
                                    balance+=betamount;
                                    System.out.println("Current Balance: "+balance);
                                }
                                else {
                                    System.out.println("You lose");
                                    balance=balance-betamount;
                                    System.out.println("Current Balance: "+balance);
                                }
                            }
                            else {
                                System.out.println("you lose");
                                balance=balance-betamount;
                                System.out.println("Current Balance: "+balance);
                            }
                        }
                    }else {
                        System.out.println("Enter lesser amount. U have only "+balance);
                    }
                }
                case  "no"->{
                    playagain=false;
                    System.out.println("Thank you for playing");
                    System.out.println("Your final balance: "+balance);
                }
                default -> System.out.println("Enter either yes or no");
            }
        }
    }
    scanner.close;
}
