import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class StudentMain {

    


    public static void main(final String[] args) throws FileNotFoundException{

        Scanner courseFile = new Scanner (new File("CourseFile.txt"));
        Scanner nameFile = new Scanner (new File("NameFile.txt"));
        
        String courseLine;

        String nameLine;
        ArrayList<Student> studentList = new ArrayList<Student>();
        while (nameFile.hasNextLine()){
            nameLine = nameFile.nextLine();
            while (courseFile.hasNextLine()){
                courseLine = courseFile.nextLine();
                studentList.add(StudentUtilities.combineAll(courseLine,nameLine));
            }      
        }

        while (!studentList.isEmpty()){

                


        }
    /*
        while nameline

            while courseline

                compare name and course
                
                if match then combine.






    */
        courseFile.close();
        nameFile.close();

    }
}