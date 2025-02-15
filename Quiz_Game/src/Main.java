import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("Hey,Hello Welcome to basic quiz game in Java");
        System.out.println("########################################################");
        String[] questions={"Q1.Which of these is not a Java keyword?",
        "Q2.What is the default value of an int variable in Java?",
        "Q3.Which of the following is the correct way to declare a variable in Java?",
        "Q4.Who is the founder of Java programming language?"};

        String[][] answers={{"1.class", "2. interface", "3. main", "4. extends"},
                {"1. 0", "2. null", "3. undefined", "4. Not assigned"},
                {"1. int 1number;",  "2. float rate;", "3. boolean = true;" , "4. String 123Name;"},
                {"1. Bjarne Stroustrup" , "2. Guido van Rossum" , "3. James Gosling" , "4. Dennis Ritchie"}};

        int[] options={3,1,2,3};
        int total=0;
        int guess;
        Scanner scanner=new Scanner(System.in);

        for (int i=0;i< questions.length;i++){
            System.out.println(questions[i]);

            for (String answer:answers[i]){
                System.out.println(answer);
            }
            System.out.print("Enter your Answer: ");
            guess= scanner.nextInt();

            if (guess==options[i]){
                System.out.println("Correct Answer");
                System.out.println("########################################################");
                total++;
            }
            else {
                System.out.println("Wrong Answer");
                System.out.println("########################################################");
            }
        }
        System.out.println("Your total score is "+total+" out of "+questions.length);
    }
}
