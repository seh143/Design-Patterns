/* ---FileManger Class---

FileManager GetInstance() - returns the singleton instance.  
 The private constructor creates the file if it does not exist.  
 
void AddGrade(int grade) - adds a grade to the file and notifies the 
observers.

Integer GetFirstGrade() - returns the first grade in the file.  
 returns null no items exist in the file.

ArrayList<int>  GetAllGrades() - returns a list or array of grades.  

void DeleteAllGrades() - deletes all grades in the file and notifies 
the observers. */

//@author: Sarah Houston
//@prof: Bilitski
//@project: Grades
//@file: FileManager.java

import java.lang.*;
import java.io.*;
import java.util.*;

public class FileManager{
    private static FileManager uniqueInstance; 
    private ArrayList<Integer> gradeList = new ArrayList<Integer>();
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    //file input stream- read from file
    private FileInputStream fin;
    //file output stream- write into file
    private FileOutputStream fout;
    private File myFile;
    private int grade;
    

    private FileManager(){
		myFile = new File("output.txt");
	}

    public static FileManager getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new FileManager();
        } 
        return uniqueInstance;
        
    }
    
    public void registerObserver(Observer o) {
		observers.add(o);
	}
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

    public void addGrade(int grd) throws IOException{
		try {
			fout = new FileOutputStream(myFile, true);
		} catch(IOException e) {
			System.out.println("File Not Found");
		}
		Integer gradee = (Integer) grd;
		gradeList.add(gradee);
		
		String strg = gradee.toString();
				
		fout.write(strg.getBytes());
		fout.write(10);
		
		System.out.println(grd + " has been added.");
		
		notifyObservers();
    }

    public int getFirstGrade() {
		if(gradeList.isEmpty()) {
			return 0;
		} else {
			return gradeList.get(0);
		}
    }

    public ArrayList<Integer> getAllGrades() {
        return gradeList;
    }

    public void deleteAllGrades() throws IOException{
		if(!gradeList.isEmpty()) {
			try {
				fout = new FileOutputStream(myFile, false);
			} catch(IOException e) {
				System.out.println("File Not Found");
			}
			
			for(Iterator<Integer> it = gradeList.iterator(); it.hasNext(); ) {
				Integer grade = it.next();
				it.remove();
			}
			System.out.println("File is now Empty.");
		} else {
			System.out.println("File is already Empty.");
		}
		notifyObservers();
    }
	
	public void notifyObservers() {
		for(Observer observer: observers) {
			observer.update(gradeList);
		}
	}



}
