import java.util.LinkedList;
import java.util.ArrayList;

public class LikedArrayListExample {
    public static void main(String[] args) {

        // Difference between LinkedList and ArrayList in Java both are implementations of the List interface,
        // LinkedList is a data structure that consists of nodes 
        // where each node contains data and a reference to the next node in the sequence.
        // ArrayList is a resizable array implementation of the List interface.
        // useful when you need to frequently add or remove elements from the beginning or middle of the list.
        LinkedList<String> likedList = new LinkedList<>();
        likedList.add("Apple");
        likedList.add("Banana");
        likedList.add("Cherry");

        // Displaying the elements in the LinkedList
        System.out.println("Liked Fruits: " + likedList);

        // Removing an element from the LinkedList
        likedList.remove("Banana");
        System.out.println("After removing Banana: " + likedList);

        // Checking if an element is in the LinkedList
        boolean hasCherry = likedList.contains("Cherry");
        System.out.println("Contains Cherry: " + hasCherry);


// faster access in ArrayList compared to LinkedList
// because ArrayList uses a dynamic array to store its elements,
// usefull when you need to frequently access elements by index.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);    
        // Displaying the elements in the ArrayList
        System.out.println("Numbers: " + numbers);  
        // Removing an element from the ArrayList
        numbers.remove(Integer.valueOf(20));
        System.out.println("After removing 20: " + numbers);
    }
}