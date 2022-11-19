package JavaOop.basics;

public class Student {
    String name = "SYAIFUL";
    int score = 99;

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println("Name : " + student1.name);
        System.out.println("Score : " + student1.score);
        System.out.println("==================");
        System.out.println("Name : " + student2.name);
        System.out.println("Score : " + student2.score);
    }
}
