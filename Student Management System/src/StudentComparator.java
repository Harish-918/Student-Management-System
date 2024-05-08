import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    private String field;
    public StudentComparator(String field){
        this.field = field;
    }
    public int compare(Student o1, Student o2){
        switch(field.toLowerCase()){
            case "name":
                return o1.getName().compareTo(o2.getName());
            case "id":
                return Integer.compare(o1.getID(), o2.getID());
            case "email":
                return o1.getEmail().compareTo(o2.getEmail());
            case "age":
                return Integer.compare(o1.getAge(), o2.getAge());
            case "gpa":
                return Double.compare(o1.getGPA(), o2.getGPA());
            default:
                return 0;
        }
    }

}
