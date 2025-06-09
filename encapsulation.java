import java.util.Scanner;

public class encapsulation {
    //Encapuslation student class
    static class Student{
        private String name;
        private int age;
        private double grade;
        public Student(String name, int age, double grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age; 
        }
        public double getGrade() {
            return grade;
        }
        public void setAge(int age) {
            if(age>19){
                this.age=age;
            }
            else{
                System.out.println("Student is underaged for Graduation grade");
            }
        }
        
        public void setGrade(double  grade) {
            if(grade>=0 && grade<=100){
                this.grade = grade;
            }
            else{
                System.out.println("Invalid grade");
            }
        }

        public void displayDetails() {
            System.out.println("Student Details : ");
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Grade : "+grade);


        }
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the student name : ");
            String name=s.nextLine();
            System.out.println("Enter the student age :");
            int age=s.nextInt();
            System.out.println("Enter the student grade :");
            double grade=s.nextDouble();
            Student st= new  Student(name,age,grade);
            //Initial student details display
            st.displayDetails();
            //Updating student data
            System.out.println("\n Update student data:");
            System.out.println("Enter new name : ");
            // clear the buffer before entering the name
            s.nextLine();
            String newName=s.nextLine();
            st.setName(newName);
            System.out.println("Enter new age :");
            int newAge=s.nextInt();
            st.setAge(newAge);
            System.out.println("Enter new grade :");
            double newGrade=s.nextDouble();
            st.setGrade(newGrade);
            System.out.println("------Updated student details : ------- ");
            //Display updated details
            st.displayDetails();
            s.close();

        }
    }


}