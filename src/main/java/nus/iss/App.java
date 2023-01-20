package nus.iss;

import java.util.Scanner;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        String[] choice = {"scissor", "paper", "stone"}; 
        Integer computerChoice, playerChoice;  
        String winner = ""; 

        Scanner scanner = new Scanner(System.in); 

        SCP scp = new SCP(); 
        computerChoice = scp.generateComputerChoice(); 

        while(winner.equals("")){
            System.out.println("Enter (1) Scissor, (2) Paper, (3) Stone: ");
            playerChoice = scanner.nextInt(); 

            if (!(playerChoice>=1) && (playerChoice<=3)){
            System.out.println("Invalid input: Only 1, 2, 3, is allowed");
            continue; 
            } 

            winner = scp.checkWinner(playerChoice, computerChoice); 
            if (winner.equalsIgnoreCase("")){
                System.out.println("It's a tie");
            } else {
                System.out.println(winner + " wins.");
            }
        }

        scanner.close(); 
    }

}
