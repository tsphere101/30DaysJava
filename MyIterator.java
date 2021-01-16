import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class MyIterator {

    public static void main(String[] args) {
        LinkedList<String> myString = new LinkedList<String>();

        myString.push("|||");
        myString.push("||||||");
        myString.push("|||||||||");

        ListIterator<String> it = myString.listIterator();

        for (int i = 0; i < 5; i++) {
            while (it.hasNext()) {
                System.out.println(it.next());
            }
            it.previous();
            while(it.hasPrevious())
            {
                System.out.println(it.previous());
            }
            it.next();
        }
    }
}
