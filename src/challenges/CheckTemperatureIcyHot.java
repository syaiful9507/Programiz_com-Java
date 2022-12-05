package challenges;

import java.util.Scanner;

class question{
/*

Challenge:

Check if the temperature is IcyHot (Easy)

Problem Description
Create a program to check if the temperature is IcyHot.

Step 1:
* Create a class named Temperature with integer fields hot and cold to store temperatures.
* Initialize the value of these fields using a constructor.
* Create a method named checkIcyHot().
* Inside the method, if hot is greater than 100 and cold is less than 0, print IcyHot.

Step 2:
* Create the main() method inside a Main class.
* Take integer input for variables hot and cold.
* Create an object of the Temperature class with arguments hot and cold.
* Call the checkIcyHot() method using the object.

Example
Test Input
300
-3

Expected Output
IcyHot
*/
}
class Temperature{
    int hot, cold;
    Temperature(int hot, int cold){
        this.hot = hot;
        this.cold =cold;
    }
    void checkIcyHot(){
        if (cold < 0 && hot > 100){
            System.out.println("IcyHot");
        }
    }
}
public class CheckTemperatureIcyHot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hot = in.nextInt();
        int cold = in.nextInt();

        Temperature tmp = new Temperature(hot, cold);
        tmp.checkIcyHot();
    }
}
