package basicProgram.constructor;

public class Main {
    int nomor;
    Main()
    {
        nomor =  1;
    }
    public static void main(String[] args) {
        Main mn = new Main();
        System.out.println(mn.nomor);
    }
}
