/* --- main ------
Load up the two user interfaces.

Read in either option 1 or 2 or 3.  Option 1 is add grade.  
 It should then read in the integer grade after it.    
 Option 2 is delete all grades.  Option 3 is quit.

As the user modifies the grades, the file is edited and the two 
 user interface classes are notified.  Program loops forever until 
 user quits using a quit option ( 3 ).

Test cases to try:
    Delete empty list of grades.  (eg perform two delete all in a row)
    Display empty grades.
    Call GetFirstGrade from main when list is empty
    Add 5 valid grades */

//@author: Sarah Houston
//@prof: Bilitski
//@project: Grades
//@file: Grades.java

import java.io.*;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) throws IOException{
        FileManager filemgr = FileManager.getInstance();
        
        filemgr.registerObserver(new Average());
        filemgr.registerObserver(new GradeDisplay());
        
        Scanner kbd = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("1. Add grade; 2. Delete all grades; 3. Quit.");
            option = kbd.nextInt();

            switch(option) {
                case 1: //add grade
                        System.out.println("Enter grade to add: ");
                        int grd = kbd.nextInt();
                        filemgr.addGrade(grd);
                        System.out.println("The first grade is: " + filemgr.getFirstGrade() + ".");
                        
                        break;

                case 2: //delete all
                        filemgr.deleteAllGrades();
                        System.out.println("The first grade is: " + filemgr.getFirstGrade() + ".");
                        break;

                case 3: //quit
                        break;

                default://error msg
                        System.out.println("Choice Invalid. Try Again.");
                        break;

            }
        } while(option != 3);



    }
}
