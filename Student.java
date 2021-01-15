public class Student {
    // Field
    int id;
    String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    // Encapsulation
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
