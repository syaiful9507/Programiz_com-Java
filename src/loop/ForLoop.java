package loop;

public class ForLoop {
    public static void main(String[] args) {
        double[] numbers = {3.5, 8.9, 1.6, -4.8};
        numbers[0] = 1.0;
        int soal = 10;
        soal = 100;
        int totalArray = numbers.length;
        for (int i = 0; i < totalArray; i++){
            System.out.println(numbers[i]);
        }
        System.out.println(soal);
    }
}
