package oop.constructors;

public class Main {
    String name;
    void displayName(){
        System.out.println("Name using this : " + this.name);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.name = "SYAIFUL";
        main.displayName();

        //print name using object
        System.out.println("Name using object : " + main.name);
    }

}
