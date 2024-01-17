package xyz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.immortalcrab.cfdi.processor.Processor.IPayload;

public class TextFileFromFileSystem implements IPayload {

    String reqStr;

    public String getReq() {
        return reqStr;
    }

    public TextFileFromFileSystem(File f) throws FileNotFoundException {
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            reqStr += sc.nextLine();
        }
    }
}
