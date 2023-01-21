package game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // String[] choice = { "scissors", "paper", "stone" };
        int computerChoice;
        int playerChoice;
        String winner = "";

        Scanner scanner = new Scanner(System.in);
        computerChoice = generateComputerChoice();
        while (winner.equals("")) {
            System.out.println("enter (1)Scissors (2)Paper (3)Stone:");
            playerChoice = scanner.nextInt();

            if (playerChoice >= 1 && playerChoice <= 3) {

            } else {
                System.out.println("Invalid Input");
                continue;
            }

            winner = checkWinner(playerChoice, computerChoice);
            System.out.println(winner);
        }

        scanner.close();
    }

    public static int generateComputerChoice() {
        Random rand = new Random();
        int a = rand.nextInt(3);
        return a;
    }

    public static String checkWinner(int playerChoice, int computerChoice) {
        String winner = "";
        if (playerChoice == computerChoice) {
            System.out.println("Tie");
            winner = "tie";
            return winner;            
        }
        switch (playerChoice) {
            case 1: // Scissor
                if (computerChoice==2){
                    winner = "player wins";
                } else {
                    winner = "computer wins";
                }
                break;
            case 2: //paper
                if (computerChoice==3){
                    winner = "player wins";
                } else {
                    winner = "computer wins";
                }
                break;
            case 3: //stone
                if (computerChoice==2){
                    winner = "player wins";
                } else {
                    winner = "computer wins";
                }
                break;
        }
        return winner;
    }

}
