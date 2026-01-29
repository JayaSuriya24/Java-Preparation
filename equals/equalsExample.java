public class equalsExample {
public static void main(String args[]) {
    int a = 10;
    int b = 20; 
    System.out.println("a equals b: " + (a == b)); // false
    System.out.println("a not equals b: " + (a != b)); // true  

    // Comparing two strings
    //stored in the string pool of heap memory
    String str1 = "Hello";
    String str2 = "Hello";
    // Creating a new string object using 'new' keyword
    //it will create a new object in the heap memory
    String str3 = new String("Hello");  
    //How the str1 and 2 are stored in the string pool and str3 is stored in the heap memory
    //.equals() method compares the content of the strings
    System.out.println("str1 equals str2: " + str1.equals(str2)); // true
    System.out.println("str1 equals str3: " + str1.equals(str3)); // true
    //.== operator compares the references of the strings
    System.out.println("str1 == str2: " + (str1 == str2)); // true
    //str1 and str3 are different references because str3 is created using new keyword
    System.out.println("str1 == str3: " + (str1 == str3)); // false
  }
}