package basicProgram.constructor;

//superclass
class Languanges {
    //basicProgram.constructor of the superclass
    Languanges(int version1, int version2){
        if (version1 > version2){
            System.out.println("The Latest version is : " + version1);
        }
        else {
            System.out.println("The latest version is : " + version2);
        }
    }
}

//child class
public class LearnConstructor1 extends Languanges {
    //basicProgram.constructor of the child class
    LearnConstructor1(){
        super(11, 8);
    }
    //main methode
    public static void main(String[] args) {
        //call the first basicProgram.constructor
        LearnConstructor1 lang = new LearnConstructor1();

    }
}
