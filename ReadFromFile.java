import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFromFile {
    public static void main(String[] args) {
            List<Student> students = new ArrayList<Student>();
        try {
            File inFile = new File("Students.txt");
            Scanner in = new Scanner(inFile);
            while (in.hasNextLine()) {
                students.add(new Student( students.size() , in.nextLine()));
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error File not found!");
            //e.printStackTrace();
        }

        for(Student student : students)
        {
            System.out.println("Student ID:" + student.getId() + " " + student.getName() );
        }
    }
}