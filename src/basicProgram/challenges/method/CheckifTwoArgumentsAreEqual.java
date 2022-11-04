package basicProgram.challenges.method;

public class CheckifTwoArgumentsAreEqual {
    String myMethod(int num1, int num2){
        String equal = (num1 == num2 ) ? "Arguments are Equal" : "Arguments are not Equal";
        return equal;
    }

    public static void main(String[] args) {
        int number1 = 8, number2 = 8;
        CheckifTwoArgumentsAreEqual obj = new CheckifTwoArgumentsAreEqual();
        String equal = obj.myMethod(number1, number2);
        System.out.println(equal);
    }
}
