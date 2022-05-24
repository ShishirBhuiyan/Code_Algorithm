/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md Shishir Bhuiyan
 */
public class _09_GradeBook_class_witha_constructor_to_initialize_the_course_name { 
    public static void main(String[] args) {
        // create GradeBook object 
        GradeBook gradeBook1 = new GradeBook( "CS101 Introduction to Java Programming", "Sam Smith" ); gradeBook1.displayMessage(); // display welcome message
        System.out.println( "\nChanging instructor name to Judy Jones\n" ); gradeBook1.setInstructorName( "Judy Jones" );
        gradeBook1.displayMessage(); // display welcome message
    }
}


class GradeBook{
    private String courseName; // course name for this GradeBook 
    private String instructorName; // name of course's instructor
    
    public GradeBook( String course, String instructor ) {
        courseName = course; // initializes courseName 
        instructorName = instructor; // initializes instructorName 
    }
    // method to set the course name
    public void setCourseName( String name ) {
      courseName = name; // store the course name 
    } // end method setCourseName
    
    // method to retrieve the course name 
    public String getCourseName() {
      return courseName; 
    } // end method getCourseName
    
    
    // method to set the instructor name
    public void setInstructorName( String name ) {
       instructorName = name; // store the course name 
    } // end method setInstructorName

    // method to retrieve the instructor name 
    public String getInstructorName() {
       return instructorName; 
    } // end method getInstructorName
    
    // display a welcome message to the GradeBook user 
    public void displayMessage() {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\n", getCourseName() );
      System.out.printf( "This course is presented by: %s\n", getInstructorName() );
    } // end method displayMessage
    
}
