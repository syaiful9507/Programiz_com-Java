package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        File file = new File("newFile.txt");

        try {
            boolean value = file.createNewFile();
            //check if file is created
            if (value){
                System.out.println("The new file is created");
            } else {
                System.out.println("The file already exist");
            }
        } catch (Exception e){
            System.out.println(e);
        }

        //Read file
        char[] contents = new char[100];
        try {
            FileReader input = new FileReader("newFile.txt");
            input.read(contents);
            System.out.println(contents);
            input.close();
        } catch (Exception e){
            System.out.println(e);
        }

        //write files
        String data = "I am learning Java. And I am loving it.";
        try {
            FileWriter output = new FileWriter("newFile.txt");
            //write string to the file
            output.write(data);
            System.out.println("Data is written to the file.");
            //close FileWriter
            output.close();
        } catch (Exception e){
            System.out.println(e);
        }
        //Read file
        try {
            FileReader input = new FileReader("newFile.txt");
            input.read(contents);
            System.out.println(contents);
            input.close();
        } catch (Exception e){
            System.out.println(e);
        }

        //Copy file to another filename (output.txt)
        try {
            FileReader copy = new FileReader("newFile.txt");
            copy.read(contents);
            FileWriter paste = new FileWriter("output.txt");
            paste.write(contents);
            copy.close();
            paste.close();


        } catch (Exception e) {
            System.out.println(e);
        }


        //Delete File
        /*
        try {
            boolean value = file.delete();
            if (value) {
                System.out.println("The File is deleted.");
            } else {
                System.out.println("The File is not deleted.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
         */

    }
}
