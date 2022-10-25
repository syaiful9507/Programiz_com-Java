package loop;

public class PowerOfNumber {
    public static void main(String[] args) {
        int number = 2, power = 8, result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
            System.out.println(result);
        }
        System.out.println(result);
    }
}
