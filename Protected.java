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
}
public class Protected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boy b = new Boy();

        System.out.print("Enter name: ");
        String nameInput = scanner.nextLine();
        b.setName(nameInput);

        System.out.print("Enter height: ");
        float height = scanner.nextFloat();
        b.setHeight(height);

        b.displayName();
        System.out.println("Height: " + b.height);
        scanner.close();
    }
}
