package xyz;

import com.immortalcrab.cfdi.processor.Processor;
import com.immortalcrab.cfdi.processor.Producer;
import java.io.File;

public class Hello {
    public static void main(String[] args) throws Exception {
        File f = new File(
            "C:\\Users\\pankaj\\Desktop\\test.txt");
        Producer.obtainSteadyPipeline().doIssue(new TextFileFromFileSystem(f));
    }
}
