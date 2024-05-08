import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static ArrayList<Student> students = new ArrayList<>();
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean shouldRun = true;
        while(shouldRun){
            System.out.println("Enter the commands (add, search, sort, view, exit): ");
            String cmd = sc.next().toLowerCase();
            switch(cmd){
                case "add":
                    addStudent(sc);
                    break;
                case "search":
                    searchStudent(sc);
                    break;
                case "sort":
                    sortStudent(sc);
                    break;
                case "view":
                    viewStudents();
                    break;
                case "exit":
                    shouldRun = false;
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
    }

    private static void addStudent(Scanner sc){
        System.out.println("Enter the student name: ");
        String name = sc.next();
        System.out.println("Enter the student ID: ");
        int ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the student Email: ");
        String email = sc.nextLine();
        while(!isValidEmail(email)){
            System.out.println("Wrong Email, Re-enter the Email: ");
            email = sc.nextLine();
        }
        System.out.println("Enter the student Age: ");
        int age = sc.nextInt();
        System.out.println("Enter the student GPA: ");
        double GPA = sc.nextDouble();
        sc.nextLine();
        Student newStudent = new Student(name, ID, email, age, GPA);

        students.add(newStudent);
        System.out.println("Student Details added Successfully!");

    }

    private static boolean isValidEmail(String email){
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    private static void searchStudent(Scanner sc){
        System.out.println("Enter the Student name: ");
        String name = sc.nextLine();
        for(Student stud:students){
            if(stud.getName().equals(name)){
                System.out.println(stud);
            }
        }
    }

    private static void sortStudent(Scanner sc){
        System.out.println("Enter the field to sort by name, ID, email, age or GPA: ");
        String field = sc.next();
        Collections.sort(students, new StudentComparator(field));
        for(Student stud:students){
            System.out.println(stud);
        }
    }

    private static  void viewStudents(){
        for (Student stud:students){
            System.out.println(stud);
        }
        System.out.println();
    }
}
