//@author: Sarah Houston
//@prof: James Bilitski
//@project: Threads
//@file: TestThread.java
//This file creates a thread for each search key 

import java.io.*;
import java.util.Scanner;
import java.lang.Thread;

public class MultiThread extends Thread {
    
    private String searchKey;

    public MultiThread(String search) {
        this.searchKey = search;
    }
    
    
    @Override
    public void run() {
        
        try{
            int count = 0;
                String line;
                String[] read;
                BufferedReader buffer = new BufferedReader(new FileReader(new File("bible.txt")));
				line = buffer.readLine();
                
                while((line = buffer.readLine()) != null) {
                    read = line.split(" ");
                    
                    for(String word : read) {
						if(word.equals(searchKey)) {
							count++;
						}
                    }
                }
                System.out.println("Found " + count + " lines that contain " + searchKey);
    
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found.");
        } catch (IOException ex) {
			System.out.println("File IO Exception.");
		}

    }
}
