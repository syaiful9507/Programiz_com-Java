package loop;

public class FindGreatestMultipleNumber {
    public static void main(String[] args) {
        int number = 9;
        for (int i = 100; i > 0 ; i--) {
            if (i % number == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
