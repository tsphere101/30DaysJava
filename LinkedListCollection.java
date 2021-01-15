//Example of "Queue"
//First in First out
import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {

        LinkedList<Student> students = new LinkedList<Student>();

        students.add(new Student(1,"Nawamol")); // First in
        students.add(new Student(2,"Molnitra")); // Second in

        System.out.println(students.remove().getName()); // First out
        System.out.println(students.remove().getName()); // Second out
    }

}
