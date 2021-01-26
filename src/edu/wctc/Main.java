package edu.wctc;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    static void leftOrRight() {
        System.out.println("Left: (0) | right: (1)");
    }

    public static void main(String[] args) {
        // Declaring: Scanner, String-Array, Int-Array, Boolean and UserScore
        Scanner scanner = new Scanner(System.in);

        String[] questions = new String[]{"Painting or Running?", "Tea or Coffee?",
                "Blue or Yellow?", "Summer or Winter?", "Pencil or Sharpie?", "mild or spicy"};
        Integer[] questionResponses = new Integer[6];

        boolean continueGame = true;
        int userScore = 0;

        //Game will run while continueGame boolean is true
        while (continueGame) {
            for (int i = 0; i < 6; i++) {
                System.out.println(questions[i]);
                leftOrRight();
                int userInput = scanner.nextInt();
                questionResponses[i] = userInput;
            }

            //The Compiler just said to replace my loop with an enhanced for-loop, I dont really know what it is,
            // but it works!
            for (Integer questionResponse : questionResponses) {
                userScore = questionResponse + userScore;
            }

            //UserFeedback/Output: if-statements, Prompts and boolean to reset game.
            if (userScore < 3) {
                System.out.println("Your personality score was " + userScore + " which means You prefer life to be calm and organized");
            } else if (userScore == 3 || userScore == 4) {
                System.out.println("Your personality score was " + userScore + " which means You prefer a good balance in life");
            } else {
                System.out.println("Your personality score was " + userScore + ", which means You prefer life to be spontaneous and active");
            }

            System.out.println("Would you like to view your answers? yes/no");
            String yesOrNo = scanner.next();

            if (yesOrNo.equals("yes") || yesOrNo.equals("Yes")) {
                System.out.println(Arrays.toString(questionResponses));

            }

            System.out.println("Would you like to play again? yes/no");
            String playAgain = scanner.next();

            if (playAgain.equals("yes") || playAgain.equals("Yes")) {
                continueGame = true;
            } else {
                System.out.println("Have a good day!");
                continueGame = false;
            }
        }
    }
}
