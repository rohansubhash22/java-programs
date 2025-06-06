import java.util.*;
class Person{
    protected String name;
    protected void setName(String name) {
        this.name = name;
    }
    protected void displayName(){
        System.out.println("Name: " + name);
    }
}
class Boy extends Person{
    protected float height;
    protected void setHeight(float height) {
        this.height = height;
    }
    public void displayDetails() {
        displayName();
        System.out.println("Height: " + height);
    }
}
class Mathop{
    protected int n;
    protected void setN(int n) {
        this.n = n;
    }
    protected int calculateSquare() {
        return n * n;
    }
    protected int calculateCube(){
        return n * n * n;
    }
}
class Result extends Mathop{
    protected void displayResults() {
        System.out.println("Square of " + n + " is: " + calculateSquare());
        System.out.println("Cube of " + n + " is: " + calculateCube());
    }   
}
public class Protected {
    public static void main(String[] args) {
        Protected.personDetails();
        Protected.SquareCubeNum();
    }
    public static void personDetails() {
        Scanner scanner = new Scanner(System.in);

        Boy b = new Boy();

        System.out.print("Enter name: ");
        String nameInput = scanner.nextLine();
        b.setName(nameInput);

        System.out.print("Enter height: ");
        float height = scanner.nextFloat();
        b.setHeight(height);
        System.out.println("\n------ Person Details ---");
        b.displayDetails();
        scanner.close();
    }
    public static void SquareCubeNum(){
        Scanner scanner = new Scanner(System.in);
        Result result = new Result();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        result.setN(number);

        System.out.println("\n------ Square and Cube Results ---");
        result.displayResults();
        scanner.close();
    }
}
