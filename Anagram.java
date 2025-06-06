import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Anagram Program");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String:");
        String str1 = sc.nextLine();

        System.out.print("Enter second String:");
        String str2 = sc.nextLine();  
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagram of each other");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean isAnagram = Arrays.equals(arr1, arr2);

            if (isAnagram) {
                System.out.println("The strings are anagram");
            } else {
                System.out.println("The strings are not anagram");
            }
        }

        sc.close();
    }
}