package exercise1;

//Derived class for Part-Time students
public class PartTimeStudent extends Student{

    public PartTimeStudent(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "PartTimeStudent{" +
                "name='" + name + '\'' +
                '}';
    }
}
