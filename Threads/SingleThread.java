//@author: Sarah Houston
//@prof: James Bilitski
//@project: Threads
//@file: TestThread.java
//This file creates a thread for a single threaded run

import java.io.*;
import java.util.Scanner;
import java.lang.Thread;

public class SingleThread extends Thread {
    
    private String[] searchKeys;

    public SingleThread(String[] search) {
        this.searchKeys = search;
    }
    
    
    @Override
    public void run() {
        for(int i = 0; i < searchKeys.length ; i++) {
            try{
                int count = 0;
                String line;
                String[] read;
                BufferedReader buffer = new BufferedReader(new FileReader(new File("bible.txt")));
                line = buffer.readLine();
                
                
                while((line = buffer.readLine())!= null) {
                    read = line.split(" ");
                    
                    for(String word : read) {
						if(word.equals(searchKeys[i])) {
							count++;
						}
                    }
                }
                System.out.println("Found " + count + " lines that contain " + searchKeys[i]);
    
            } catch (FileNotFoundException ex) {
                System.out.println("File Not Found.");
            } catch (IOException ex) {
				System.out.println("File IO Exception.");
			}
    
			
        }


   }

}
