package filehandling;

import java.io.File;
import java.util.ArrayList;

public class Directory {
    public static void main(String[] args) {
        File file = new File("Movies");

        //try to create a new directory
        boolean value = file.mkdir();
        if (value){
            System.out.println("The new directory is created");
        } else {
            System.out.println("The directory already exists ");
        }

        File subdir = new File("Movies/johnWick");
        boolean value1 = subdir.mkdir();
        if (value1){
            System.out.println("The new Sub directory is created");
        } else {
            System.out.println("The Sub directory already exists ");
        }

        //List all file of a directory
        try {
            String[] fileList = subdir.list();
            for (String list : fileList ) {
                System.out.println(list);
            }
        } catch (Exception e){
            System.out.println(e);
        }

        //Rename a File
        try {
            File oldFile = new File("Movies/johnWick/newFile.txt");
            File newFile = new File("Movies/johnWick/MyFile.txt");
            boolean renamed = oldFile.renameTo(newFile);
            if (renamed){
                System.out.println("the name of the file is changed");
            } else {
                System.out.println("The name cannot be changed.");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        //create a file object
        ArrayList<String>  str = new ArrayList<>();


    }
}
