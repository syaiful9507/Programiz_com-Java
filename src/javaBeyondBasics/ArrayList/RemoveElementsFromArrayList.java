package javaBeyondBasics.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jeremy");
        names.add("Jules");
        names.add("Howard");
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        names.remove(index);
        System.out.println(names);

    }
}
