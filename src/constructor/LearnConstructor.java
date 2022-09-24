package constructor;

public class LearnConstructor {
    int sum;
    LearnConstructor(){
        //call this second constructor
        this(5,2);
    }

    //second Constructor
    LearnConstructor(int arg1, int arg2){
        //add two value
        this.sum = arg1 + arg2;
    }

    void display(){
        System.out.println("Sum is  : " + sum);
    }
    public static void main(String[] args) {
        //Cal One Constructor fom another

        /*
        Call the fist constructor
         */
        LearnConstructor lc = new LearnConstructor();
        //call display methode
        lc.display();
    }
}
