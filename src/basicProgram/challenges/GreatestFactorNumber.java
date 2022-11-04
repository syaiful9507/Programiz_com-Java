package basicProgram.challenges;

public class GreatestFactorNumber {
    public static void main(String[] args) {

        int number = 14;

        for (int i = number - 1; i > 0; i--){
            if (number % i == 0){
                System.out.println(i);
                break;
            }

        }
    }
}
