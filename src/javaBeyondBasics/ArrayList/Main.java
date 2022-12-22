package javaBeyondBasics.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //create arraylist
        ArrayList<String> names = new ArrayList<>();

        //add element to arraylist
        names.add("SYAIFUL");
        names.add("WULAN");
        names.add("ABIZAR");
        System.out.println(names);
        System.out.println("====input from user======");

        Scanner in = new Scanner(System.in);
        String name1, name2;
        name1 = in.nextLine();
        name2 = in.nextLine();

        names.add(name1);
        names.add(name2);
        System.out.println(names);
        for (int i = names.size()  - 1; i >= 0; i--) {
            System.out.print(names.get(i) + " ");
        }



    }
}
