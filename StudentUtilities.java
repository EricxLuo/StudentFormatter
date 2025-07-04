import java.util.ArrayList;
<<<<<<< HEAD
public class StudentUtilities{
    


=======

public class StudentUtilities {
>>>>>>> edf2df3bbe9e3af48b63e824d6e165f17610ec9b

    /**
     * Runs the read functions and combines the two arrays together
     * @param course
     * @param text
     * 
     * 
     */
    public static Student readAll(Final String course,Final string text){

        String[] c = combine(readCourseLine(course),readNameLine(text));
        Student student = new Student(
            Integer.parseInt(c[0]),//id
            c[6],//name
            c[1],//course code
            Integer.parseInt(c[2]),//test 1
            Integer.parseInt(c[3]),//test 2
            Integer.parseInt(c[4]),//test 3
            Integer.parseInt(c[5]) //test 4
            )

        return student;

    }

<<<<<<< HEAD

=======
>>>>>>> edf2df3bbe9e3af48b63e824d6e165f17610ec9b
    /**
     * Reads a line of CourseFile.txt and puts into array a
     * @param course
     * @return a
     * 
     */
    public static String[] readCourseLine(Final String course){

        String[] a = new String[6];
        

        String[] dataSplit = line.split(",");


        String studentId = dataSplit[0];
        String course = dataSplit[1];
        String test1 = dataSplit[2];
        String test2 = dataSplit[3];
        String test3 = dataSplit[4];
        String finalExam = ataSplit[5];

       
        return a;
        
    }
<<<<<<< HEAD
=======

>>>>>>> edf2df3bbe9e3af48b63e824d6e165f17610ec9b
    /**
     * Reads a line of NameFile.txt and puts into array a
     * @param text
     * @return b
     * 
     */
    public static String[] readNameLine(Final string text){  
        String b[] = new String [2];
        
        String[] dataSplit = line.split(",");
        String studentId =dataSplit[0];
        String studentName = dataSplit[1];


        return b;

    }

<<<<<<< HEAD


=======
>>>>>>> edf2df3bbe9e3af48b63e824d6e165f17610ec9b
    /**
     * Checks both files student names and will combine if they match
     * @param text
     * @return student
     * 
     */
    public static Student combine(String[]a, String[]b){
        
        if (a[0] == b[1]){
            String combined[] = [7];
            for (int i=0; i <a.length; i++_{
                combined[i] = a[i];

            })
            combined[7] = b[1];            
            return combined;
        }

    }

<<<<<<< HEAD
    
=======
>>>>>>> edf2df3bbe9e3af48b63e824d6e165f17610ec9b
}