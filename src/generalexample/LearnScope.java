package generalexample;

import java.io.File;
import java.util.Arrays;

public class LearnScope {
    public static void main(String[] args) {
        File directory=new File("/Users/dhirajkumarjaiswal/Documents/CheckFiles/");
        File[] file=directory.listFiles();
        for (int i = 0; i < file.length; i++) {
            System.out.println(file[i].getName());
        }


    }
}
