package project;

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

    String getResult(String name){
        Main obj = new Main();
        String nameTolower = name.toLowerCase();
        String result;
        if ((name == "rock" && obj.getRandomChoice() == "scissors") || (name == "paper" && obj.getRandomChoice() == "rock") || (name == "scissors" && obj.getRandomChoice() == "paper")){
            result = "You Win";
        } else if (name.equals(obj.getRandomChoice())){
            result = "drew";
        } else {
            result = "Fail";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pick Name : ");
        String pickName = in.next();
        Main obj = new Main();
        String result = obj.getResult(pickName);
        System.out.println(result);

    }
}
