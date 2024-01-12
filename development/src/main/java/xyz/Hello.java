package xyz;

import com.immortalcrab.cfdi.processor.Producer;
import com.immortalcrab.cfdi.errors.EngineError;


public class Hello {
    public static void main(String[] args) throws EngineError {
        System.out.println("Hello, World!"); 
        Producer.obtainSteadyPipeline();
    }
}