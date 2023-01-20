package nus.iss;

import java.util.Random;

public class SCP {
    public Integer generateComputerChoice(){
        Random rand = new Random(); 
        return rand.nextInt(3); 
    }

    public String checkWinner(Integer playerChoice, Integer computerChoice){

        String winner = "";
        playerChoice = playerChoice - 1;

        if(playerChoice.equals(computerChoice)){
            System.out.print("Tie");
            return ""; 
        }

        switch (playerChoice){
            case 0: //scissors
            if (computerChoice == 1) {
                winner = "player"; 
            } else {
                winner = "computer"; 
            }
            break; 

            case 1: //paper
            if (computerChoice == 2) {
                winner = "player"; 
            } else {
                winner = "computer"; 
            }
            break;

            case 2: //stone
            if (computerChoice == 0) {
                winner = "player"; 
            } else {
                winner = "computer"; 
            }
            break;

        }

        return null;

    }

    
}
