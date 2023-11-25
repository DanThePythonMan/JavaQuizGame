import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        String[] trueAnswers = new String[3];
        trueAnswers[0] = "Right";
        trueAnswers[1] = "Java";
        trueAnswers[2] = "Kaupenjoe";

        String[] playerAnswers = askQuestions();

        checkAnswers(playerAnswers,trueAnswers);
    }

    public static void print(String output){
        System.out.println(output);
    }

    public static String[] askQuestions(){

        Scanner scanner = new Scanner(System.in);

        String[] questions = new String[3];
        questions[0] = "What is the opposite of Left? ";
        questions[1] = "What is the language being used for this game? ";
        questions[2] = "Who made this tutorial? ";

        String[] answers = new String[3];
        for (int i = 0;i < questions.length;i++){
            print(questions[i]);

            answers[i]=scanner.next();


        }
        return answers;

    }

    public static void checkAnswers (String[] playerAnswers,String[] trueAnswers){
        for (int i = 0; i < playerAnswers.length;i++){

            if (playerAnswers[i].equalsIgnoreCase(trueAnswers[i])){
                print("You got Question " + (i+1) +" Correct!");
            }
            else{
                print("You got Question " + (i+1) +" Wrong. The correct answer was "+ trueAnswers[i]);
            }

        }

    }
}