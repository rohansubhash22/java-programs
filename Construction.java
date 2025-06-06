import java.util.*;
class Student{
    String name;
    int marks;

    Student(String n,int m){
        name = n;
        marks = m;

    }
    void display(){
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);

    }
}
public class Construction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();
        
        Student s = new Student(name, marks);
        s.display();
        sc.close();
    }
}