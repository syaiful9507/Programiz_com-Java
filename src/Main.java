class Company {
    String name, ceo;
    public Company(){
        name = "PT. Ws Consulting";
        ceo = "SYAIFUL";
    }
}
class Languange {
    String languanges;
    public  Languange(String lang)
    {
        languanges = lang;
        System.out.println(languanges + " Programming Language");
    }
}
class MultipleValConst{
    int[] i;
    public MultipleValConst(int[] j){
        System.out.println(j[3]);
    }
}
public class Main {
    private String name;

    Main() {
        System.out.println("Construct Called : ");
        name = "Programiz";
    }

    public static void main(String[] args) {
        System.out.println("SYAIFUL'S LEARN");
        /*
        #######DATA TYPE ######################
         */
        //Boolean data type
        boolean flag = true;
        System.out.println(flag);
        //Byte data type
        byte range;
        range = 127;
        System.out.println(range);

        //short type from -32768 to 32767
        short temperature;
        temperature = 32767;
        System.out.println(temperature);

        //integer have value from -2**31 to 2**31-1
        int int_range;
        int_range = -4250000;
        System.out.println(int_range);

        ///long have value from -2**63 to 2**63-1
        long long_range;
        long_range = -42332200000L;
        System.out.println(long_range);

        //double data type 64bit
        double double_range;
        double_range = -42.3;
        System.out.println(double_range);

        //float data type 32 bit
        float float_range;
        float_range = -42.3f;
        System.out.println(float_range);

        //char type - The minimum value of the char data type is '\u0000' (0) and the maximum value of the is '\uffff'.
        char letter = '\u0051', letter1 = '9', letter2 = 65;

        System.out.println(letter);
        System.out.println(letter1);
        System.out.println(letter2);

        //String
        String first = "Java";
        String second = "Python";
        String third = "JavaScript ";
        String fourth = "Java";
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //String Operations
        System.out.println("String : " +  first);
        int length = first.length();
        System.out.println("Length : " +  length    );
        char[] pj = first.toCharArray();
        System.out.println(pj[3]);

        System.out.println("Join Two String ");
        String joinedString = first.concat(second);
        System.out.println("Joined String : " + joinedString);

        //Compare two String using equals
        boolean result1 = first.equals(fourth);
        System.out.println("String first and fourth are equal : " + result1);
        boolean result2 = first.equals(second);
        System.out.println("String first and second are equal : "+ result2);
        //Compare two String using ==
        boolean result3 = (first == second);
        System.out.println(result3);
        System.out.println(result2);

        String fifth = new String("Python");
        String sixth = fifth;
        System.out.println("Check if two strings are equal");
        //using == operator
        boolean result4 = (fifth == sixth);
        System.out.println("Using == Operator : " + result4);

        //using equals
        boolean result5 = fifth.equals(sixth);
        System.out.println("Using Equals : " + result5);

        //escape character
        String example = "This is the \"String\" class.";
        System.out.println(example);

        /*
        /constructor
        A constructor in Java is similar to a method that is invoked when an object of the class is created.
        a constructor has the same name as that of the class and does not have any return type. For example,
         https://www.programiz.com/java-programming/constructors
         */
        Main obj = new Main();
        System.out.println("The name is " + obj.name);
        
        System.out.println("Here, Construct no-arg constructors for public ");
        Company cmp = new Company();
        System.out.println(cmp.name + " " + cmp.ceo);
        System.out.println("\n\n");
        System.out.println("Here, Parameterized Constructor ");
        Languange lg = new Languange("Java");
        Languange lg1 = new Languange("Python");
        Languange lg2 = new Languange("C");

        System.out.println("\n\n");
        int[] val = {1,2,4,5};
        MultipleValConst varr = new MultipleValConst(val);












    }
}
