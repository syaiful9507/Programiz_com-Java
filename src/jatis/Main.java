package jatis;

public class Main {
    public static void main(String[] args) {
        String text = "dani maulana";
        String temp = String.valueOf(text.charAt(0));
        int flage = 0;
        for (int i = 0; i < text.length(); i++) {

            for (int j = 0; j < temp.length(); j++) {


                if (text.charAt(i) == temp.charAt(j)){
                    //System.out.println(text.charAt(i));
                    //temp = temp.concat(String.valueOf(text.charAt(i)));
                    //System.out.println(temp);
                    flage++;
                } else if ((j == temp.length() -1) && flage == 0){
                    temp = temp.concat(String.valueOf(text.charAt(i)));
                    System.out.println(temp);
                    flage = 0;
                }

            }
            //System.out.println(text.);
            //System.out.println(temp);

        }
        System.out.println(flage);

        System.out.println(temp);



    }
}
