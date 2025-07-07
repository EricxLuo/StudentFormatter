import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class StudentMain {

    


    public static void main(final String[] args) throws FileNotFoundException{

        Scanner courseFile = new Scanner (new File("CourseFile.txt"));
        Scanner nameFile = new Scanner (new File("NameFile.txt"));
        
        String courseLine;

        String nameLine;

        while (nameFile.hasNextLine()){
            nameLine = nameFile.nextLine();
            while (courseFile.hasNextLine()){
                courseLine = courseFile.nextLine();


                Student student = StudentUtilities.combineAll(courseLine,nameLine);

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
        courseFile.close();
        nameFile.close();

    }
}