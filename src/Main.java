import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "Which of the following is not considered a Decomposer? (Enter the Corresponding number)" ;
        String choiceOne = "fungi";
        String choiceTwo = "vultures";
        String choiceThree = "sunflowers";

        String correctAnswer = choiceThree;

        System.out.println(question);

        System.out.println(choiceOne + "    " + choiceTwo + "     " + choiceThree);

        Scanner scanner = new Scanner(System.in);

        String UserChoice = scanner.next();

        if (correctAnswer.equals(UserChoice.toLowerCase())){

            System.out.println("Correct! Great Job");
        }

        else{

            System.out.println("Incorrect. The correct choice was...... Sunflowers");
        }
    }
}
