//@author: Sarah Houston
//@prof: James Bilitski
//@project: Threads
//@file: TestThread.java
//This is the main method to run the program

import java.lang.Thread;
import java.util.*;

public class Threads{
    public static void main(String[] args) {
                
        
        
        if (args[0].equals("s")) {
            String[] array = new String[args.length-1];
            for(int j = 1; j < args.length; j++) {
                int k = j-1;
                array[k] = args[j];
            }
            Thread single = new SingleThread(array);
            single.start();

            
        } else if (args[0].equals("m")) {

            for(int i = 1; i < args.length ; i++) {
               Thread multi = new MultiThread(args[i]);
                multi.start();
            }


        } else {
            System.out.println("Invalid arguments. Please use form: java TestThread <s or m> <search keys seperated by spaces>");
        }
        
        
    }

    
}
