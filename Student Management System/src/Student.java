import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String name;
    private int ID;
    private String email;
    private int age;
    private double GPA;
    Student(String name, int ID, String email, int age, double GPA){
        this.name = name;
        this.ID = ID;
        this.email = email;
        this.age = age;
        this.GPA = GPA;
    }
    public String getName(){
        return this.name;
    }public int getID(){
        return this.ID;
    }public String getEmail(){
        return this.email;
    }public int getAge(){
        return this.age;
    }public double getGPA(){
        return this.GPA;
    }

    public void setName(String name){
        this.name = name;
    }public void setID(int ID){
        this.ID = ID;
    }public void setEmail(String email){
        this.email = email;
    }public void setAge(int age){
        this.age = age;
    }public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public String toString(){
        return "Student name: "+name+"\nID: "+ID+"\nEmail: "+email+"\nAge: "+age+"\nGPA: "+GPA;
    }
}
