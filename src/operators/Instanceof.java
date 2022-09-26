package operators;

/*
The instanceof operator checks whether an object is an instanceof a particular class.
 */
public class Instanceof {
    public static void main(String[] args) {
        String str = "Programiz";
        boolean result;

        //checks if str is an instance of
        //the String class
        result = str instanceof String;
        System.out.println("Is Str an object of string " + result);

        /*

        Is str an object of String? true

        Here, str is an instance of the String class. Hence, the instanceof operator returns true
         */
    }
}
