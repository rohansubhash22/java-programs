import java.util.*;
interface Father{
    void getFatherDetails(Scanner sc);
    void showFatherDetails();
}
interface Mother{
    void getMotherDetails(Scanner sc);
    void showMotherDetails();
}
class Child implements Father,Mother{
    String fatherName,motherName,childName;
    int fatherAge,motherAge,childAge;
    String fatherJob,motherJob,childHobby;

    public void getFatherDetails(Scanner sc) {
        System.out.print("Enter Father's Name: ");
        fatherName = sc.nextLine();
        System.out.print("Enter Father's Age: ");
        fatherAge = sc.nextInt(); 
        sc.nextLine(); 
        System.out.print("Enter Father's Job: ");
        fatherJob = sc.nextLine();
    }
    public void showFatherDetails() {
        System.out.println("\nFather's Details:");
        System.out.println("Name: " + fatherName);
        System.out.println("Age: " + fatherAge);
        System.out.println("Job: " + fatherJob);
    }

    public void getMotherDetails(Scanner sc) {
        System.out.print("Enter Mother's Name: ");
        motherName = sc.nextLine();
        System.out.print("Enter Mother's Age: ");
        motherAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Mother's Job: ");
        motherJob = sc.nextLine();
    }

    public void showMotherDetails() {
        System.out.println("\nMother's Details:");
        System.out.println("Name: " + motherName);
        System.out.println("Age: " + motherAge);
        System.out.println("Job: " + motherJob);
    }
    public void getChildDetails(Scanner sc) {
        System.out.print("Enter Child's Name: ");
        childName = sc.nextLine();
        System.out.print("Enter Child's Age: ");
        childAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Child's Hobby: ");
        childHobby = sc.nextLine();
    }
    public void showChildDetails() {
        System.out.println("\nChild's Details:");
        System.out.println("Name: " + childName);
        System.out.println("Age: " + childAge);
        System.out.println("Hobby: " + childHobby);
    }  

}

public class Multipath{
    public static void main(String[] args) {
        Multipath.Family();
        Multipath.math();
    }
    public static void Family(){
        Scanner sc = new Scanner(System.in);
        Child child = new Child();
        System.out.println("--------Enter Father details------------");
        child.getFatherDetails(sc);
        child.showFatherDetails();
        System.out.println("--------Enter Mother details------------");
        child.getMotherDetails(sc);
        child.showMotherDetails();
        System.out.println("--------Enter Child details------------");
        child.getChildDetails(sc);
        child.showChildDetails();
        sc.close(); 
    }
    public static void math(){

    }
} 