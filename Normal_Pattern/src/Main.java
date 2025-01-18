import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int r,c;
        String s;
        System.out.print("Enter no of rows: ");
        r= scanner.nextInt();
        System.out.print("Enter no of columns: ");
        c= scanner.nextInt();
        System.out.print("Enter Symbol: ");
        s= scanner.next();
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(s);
            }System.out.println();
        }
        scanner.close();
    }
}
