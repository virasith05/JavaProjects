import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int roll;
        int total =0;
        System.out.print("Enter how many times u want to roll the dice: ");
        int nofofdice= scanner.nextInt();

        if (nofofdice>0){
            for (int i=0;i<nofofdice;i++){
                roll=random.nextInt(1,7);
                System.out.println("You have rolled: "+roll);
                dice(roll);
                total+=roll;
            }
            System.out.println("Total: "+total);
        }
        else {
            System.out.println("Invalid Number");
        }

        scanner.close();

    }static void dice(int roll){
        String d1= """
                 ---------------
                |               |
                |       ●       |
                |               |   
                 ---------------
                """;
        String d2= """
                 ---------------
                |   ●           |
                |               |
                |            ●  |   
                 ---------------
                """;
        String d3= """
                 ---------------
                |   ●           |
                |       ●       |
                |           ●   |   
                 ---------------
                """;
        String d4= """
                 ---------------
                |   ●       ●   |
                |               |
                |   ●       ●   |   
                 ---------------
                """;
        String d5= """
                 ---------------
                |   ●       ●   |
                |       ●       |
                |   ●       ●   |   
                 ---------------
                """;
        String d6= """
                 ---------------
                |   ●       ●   |
                |   ●       ●   |
                |   ●       ●   |   
                 ---------------
                """;

        switch (roll){
            case 1 ->System.out.println(dice1);
            case 2 ->System.out.println(dice2);
            case 3 ->System.out.println(dice3);
            case 4 ->System.out.println(dice4);
            case 5 ->System.out.println(dice5);
            case 6 ->System.out.println(dice6);
            default -> System.out.println("Invalid");
        }
    }
}
