import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
        // This input will store in the string pool of the heap memory
        String input = "first commit";
        System.out.println(input);
        // This input will also store in the string pool of the heap memory
        String input2 = "first commit";
        System.out.println(input2);
        // Comparing both the references, 
        // It will return true as both are pointing to the same location in the string pool
        System.out.println(input == input2);

        // This inputs will store in String pool of the heap memory
        String input3 = "first commit";
        System.out.println(input3);
        // Comparing both the references, 
        String input4 = "second commit";
        System.out.println(input4);
        // It will return false as both are pointing to different location in the string pool
        System.out.println(input == input4);

        // Creating strings using new keyword
        String str1 = new String("hello");
        String str2 = new String("hello");
        // Comparing both the references, 
        // It will return false as both are pointing to different location in the heap memory
        System.out.println(str1 == str2);
        // .equals() method compares the content of the strings
        System.out.println(str1.equals(str2));
    }
}