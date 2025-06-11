import java.io.IOException;
import java.util.Scanner;
public class Throw1{
    static void readInput() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any data:");
        String data = sc.nextLine();
        System.out.println("You entered: " + data);
        sc.close();
    }
    public static void main(String[] args) {
        try {
            readInput();
        } catch (IOException e) {
            System.out.println("IOException occurred: ");
        }
    }
}