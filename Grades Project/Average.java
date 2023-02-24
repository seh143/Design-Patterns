/* ---- User Interface that shows average ------
Displays the average of all grades.  Anytime the grades change, 
this is notified and should display the new average. */

//@author: Sarah Houston
//@prof: Bilitski
//@project: Grades
//@file: Average.java

import java.lang.*;
import java.io.*;
import java.util.ArrayList;

public class Average implements Observer, DisplayElement{
	private ArrayList<Integer> grades;
	private float average;
	
    public Average() {}
    
    public void update(ArrayList<Integer> gradeList) {
		grades = gradeList;
		if(grades.isEmpty()) {
			this.average = 0;
		} else {
			int total = 0;
			int count = 0;
			for(Integer grd: grades) {
				total += grd.intValue();
				count++;
			}
			this.average = (float) total / count;
		}
		display();
	}
	
	public void display() {
		System.out.println("The average is: " + average);
	}
}
