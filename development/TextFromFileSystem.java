package javaapplication2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileFromFileSystem {

    String reqStr;

    public String getReqStr() {
        return reqStr;
    }

    public TextFileFromFileSystem(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            reqStr += sc.nextLine();
        }
    }
}
