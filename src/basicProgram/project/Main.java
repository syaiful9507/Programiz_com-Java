package basicProgram.project;

import java.util.Scanner;

public class Main {
    String getRandomChoice(){
        int random = (int ) (Math.random() * 3 + 1);
        String choice;
        if (random == 1){
            choice = "rock";
        } else if (random == 2) {
            choice = "paper";
        } else {
            choice = "scissors";
        }
        return choice;
    }

    String getUserInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Pick Name (rock, paper, scissors : ");
        String userInput = in.nextLine();
        userInput = userInput.toLowerCase();
        return userInput;
    }
    String getResult(String userPick, String comPick){

        if (userPick.equals(comPick)) {
            return "Draw";
        }  else if (userPick.equals("rock") && comPick.equals("scissors")){
            return "WIN";
        } else if (userPick.equals("paper")  && comPick.equals("rock")) {
            return  "WIN";
        } else if (userPick.equals("scissors") && comPick.equals("paper")) {
            return  "WIN";
        } else {
            return  "LOSE";
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        String userInput = obj.getUserInput();
        String randomChoice = obj.getRandomChoice();
        String result = obj.getResult(userInput, randomChoice);
        System.out.println("--------------COMPARE---------------------");
        System.out.println("You Pick\t\t\t: " + userInput);
        System.out.println("Computer Pick\t\t: " + randomChoice);


        System.out.println("--------------RESULT---------------------");
        System.out.println(result);
        System.out.println("-----------------------------------------");


    }
}
