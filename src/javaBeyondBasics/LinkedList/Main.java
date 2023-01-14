package javaBeyondBasics.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("A0");
        names.add("A1");
        names.add("A2");
        names.add("A3");
        names.add("A4");
        for (String name : names ) {
            System.out.print(name + " ");
        }
    }
}
