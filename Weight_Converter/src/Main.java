import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Weight Conversion");
        System.out.println("1.Convert lbs to kgs");
        System.out.println("2.Convert kgs to lbs");

        Scanner scanner=new Scanner(System.in);

        System.out.print("Choose an Option(1 or 2): ");
        int opt=scanner.nextInt();

        if (opt==1){
            System.out.print("Enter the weight in lbs: ");
            double lbs= scanner.nextDouble();
            double kgs1=lbs*0.453592;
            System.out.println("The weight in kgs is: "+kgs1);

        }
        else if (opt==2){
            System.out.print("Enter the weight in kgs: ");
            double kgs= scanner.nextDouble();
            double lbs1=kgs*2.20462;
            System.out.println("The weight in lbs is: "+lbs1);

        }
        else {
            System.out.println("Enter a valid Number for conversion");
        }

        scanner.close();

    }
}
