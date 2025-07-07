import java.io.File;
import java.util.Scanner;
import StudentUtilities;


public class StudentMain {

    Student student;


    public static void main(final String[] args){

        Scanner courseFile = new Scanner ("CourseFile.txt");
        Scanner nameFile = new Scanner ("NameFile.txt");
        
        String courseLine;

        String nameLine;

        while (nameLine.hasNextLine()){
            nameLine = nameLine.nextLine();
            while (courseLine.hasNextLine()){
                courseLine = courseLine.nextline();


                student = StudentUtilities.combineAll(courseLine,nameLine);






                
                /*student is combined. now call the compare to 
                and then start sorting the list.
                */
            } 
           
            
        }

    /*
        while nameline

            while courseline

                compare name and course
                
                if match then combine.






    */


    }
}