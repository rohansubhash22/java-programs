import java.util.*;
class Animal{
    String name;
    void details(Scanner s)
    {
        System.out.print("Enter animal name: ");
        name = s.nextLine();
    }
    void showanimal() {
        System.out.println("Animal : " + name);
    }
}
class Mammal extends Animal{
    String type;
    void mammaltype(Scanner s){
        System.out.print("Enter the animal type: ");
        type = s.nextLine();
    }
    void showmammal() {
        System.out.println("Mammal Type: " + type);
    }
}
class Dog extends Mammal{
    String breed;
    void breeddetails(Scanner s){
        System.out.print("Enter the dog breed: ");
        breed = s.nextLine();
    }
    void showdog() {
        System.out.println("Dog Breed: " + breed);
    }
}

class Inputnumbers{
    int a,b;
    void getInput(Scanner s){
        System.out.print("Enter first number: ");
        a = s.nextInt();
        System.out.print("Enter second number: ");
        b = s.nextInt();
    }
}
class PowerCal extends Inputnumbers{
    void power(){
        int result = 1;
        for(int i=1;i<=b;i++){
            result *= a;
        }
        System.out.println("Power (" + a + " ^ " + b + ") is: " + result);
    }
}
class FactorialCal extends PowerCal{
    int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    void showFactorial(){
        System.out.println("Factorial of " + a + " is: " + factorial(a));
        System.out.println("Factorial of " + b + " is: " + factorial(b));
    }
}
public class Multilevel {
    public static void main(String[] args){
        Multilevel.Dog();
        Multilevel.factpow();
        
    }
    public static void Dog(){
        Scanner s=new Scanner(System.in);
        Dog mydog=new Dog();
        mydog.details(s);
        mydog.mammaltype(s);
        mydog.breeddetails(s);
        System.out.println("\n-------------------My Dog Details-------------------");
        mydog.showanimal();
        mydog.showmammal();
        mydog.showdog();
    }
    public static void factpow(){
        Scanner s= new Scanner(System.in);
        FactorialCal obj = new FactorialCal();
        obj.getInput(s);
        obj.power();
        obj.showFactorial();
        s.close();
    }
}
