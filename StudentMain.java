import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;



/*
 * 
 * Main file, reads each file, splits the names and then loops through all IDS to check if they match
 * If match, call combineAll from StudentUtilities to make a Student object
 * Then call .sort to sort by ID
 * 
 * Finally, format into a new file
 * 
 * 
 */
public class StudentMain {

    


    public static void main(final String[] args) throws FileNotFoundException, IOException{
        Scanner courseFile = new Scanner (new File("StudentFormatter/CourseFile.txt"));
        Scanner nameFile = new Scanner (new File("StudentFormatter/NameFile.txt"));
        
     
        ArrayList<Student> studentList = new ArrayList<Student>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> courses = new ArrayList<>();

        
        while (nameFile.hasNextLine()){
            names.add(nameFile.nextLine().trim());
        }
        while (courseFile.hasNextLine()){
            courses.add(courseFile.nextLine().trim());
        }      

        for (String nameLine: names){
            String compName = nameLine.split(",")[0].trim();
            for (String courseLine: courses){
                String compID = courseLine.split(",")[0].trim();
                if (compID.equals(compName)){
                    studentList.add(StudentUtilities.combineAll(courseLine,nameLine));
                } 
            }
            
        }
    
        

        studentList.sort(null);
        FileWriter formattedFile = new FileWriter("StudentDatabase.txt");
        formattedFile.write("Student ID | Student Name         | Course Code | Final Grade \n" );
        formattedFile.write ("------------------------------------------------------------\n");
        for (Student s : studentList) {
            formattedFile.write(s +"\n" );
        }
    
        courseFile.close();
        nameFile.close();
        formattedFile.close();
    }
    
}