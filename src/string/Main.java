package string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] features = {"Electric ", "Fast "};
        String[] cars = {"Tesla ", "Porsche ", "Mercedes "};

        //outer loop
        for (int i =0; i < features.length; ++i){

            for (int j = 0; j < cars.length; ++j){
                System.out.println(features[i] + cars[j] );
            }
            System.out.println("--------");
        }

    }
}
