/* ---- User Interface that shows each grade -----
Displays all the grades (horizontally with a space between each grade).  
Anytime the grades change, this is notified and should display all the grades again */

//@author: Sarah Houston
//@prof: Bilitski
//@project: Grades
//@file: GradeDisplay.java

import java.lang.*;
import java.io.*;
import java.util.ArrayList;

public class GradeDisplay implements Observer, DisplayElement{
    private ArrayList<Integer> grades;

    public GradeDisplay() {}
	
	public void update(ArrayList<Integer> gradeList) {
		grades = gradeList;
		
		display();
	}
	
	public void display() {
		if(grades.isEmpty()) {
			System.out.println("There are no grades.");
		} else {
			System.out.print("The grades are:");
			for(Integer grd: grades) {
				System.out.print(" " + grd.intValue());
			}
			System.out.println();
		}
	}
}
