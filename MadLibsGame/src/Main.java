import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("This is the question for Mad Libs Game");
        System.out.println("It was a __1__ (adjective), cold November day. \n" +
                "I woke up to the __2__ (adjective) smell of __3__ (type of bird) roasting " +
                "in the __4__ (room in a house) downstairs. \nI __5__ (verb, past tense) down " +
                "the stairs to see if I could help __6__ (verb) the dinner. \nMy mom said, " +
                "See if __7__ (relative's name) needs a fresh __8__ (noun).\nSo I carried a tray " +
                "of glasses full of __9__ (a liquid) into the __10__ (verb ending in -ing) room.\n" +
                "When I got there, I couldn't believe my __11__ (part of the body, plural)! " +
                "There were __12__ (plural noun) __13__ (verb ending in -ing) on the __14__ (noun)!");

        Scanner scanner=new Scanner(System.in);

        //1
        System.out.print("Blank-1 will be: ");
        String adjective1= scanner.nextLine();

        //2
        System.out.print("Blank-2 will be: ");
        String adjective2= scanner.nextLine();

        //3
        System.out.print("Blank-3 will be: ");
        String noun1 = scanner.nextLine();

        //4
        System.out.print("Blank-4 will be: ");
        String noun2= scanner.nextLine();

        //5
        System.out.print("Blank-5 will be: ");
        String verb1 = scanner.nextLine();

        //6
        System.out.print("Blank-6 will be: ");
        String verb2= scanner.nextLine();

        //7
        System.out.print("Blank-7 will be: ");
        String noun3 = scanner.nextLine();

        //8
        System.out.print("Blank-8 will be: ");
        String noun4= scanner.nextLine();

        //9
        System.out.print("Blank-9 will be: ");
        String noun5 = scanner.nextLine();

        //10
        System.out.print("Blank-10 will be: ");
        String verb3 = scanner.nextLine();

        //11
        System.out.print("Blank-11 will be: ");
        String noun6= scanner.nextLine();

        //12
        System.out.print("Blank-12 will be: ");
        String noun7 = scanner.nextLine();

        //13
        System.out.print("Blank-13 will be: ");
        String verb4= scanner.nextLine();

        //14
        System.out.print("Blank-14 will be: ");
        String noun8= scanner.nextLine();

        System.out.print("It was a "+ adjective1 +" , cold November day. \n" +
                "I woke up to the "+adjective2+" smell of "+noun1+" roasting" +
                " in the "+noun2+" downstairs. \nI "+verb1+" down the stairs to " +
                "see if I could help "+verb2+" the dinner. \nMy mom said, See " +
                "if "+noun3+" needs a fresh "+noun4+" .\nSo I carried a tray " +
                "of glasses full of "+noun5+" into the "+verb3+" room. \nWhen " +
                "I got there, I couldn't believe my "+noun6+" ! There " +
                "were "+noun7+" "+verb4+" on the "+noun8+".");
        scanner.close();
    }
}
