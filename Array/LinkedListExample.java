import java.util.LinkedList;

public class LinkedListExample {   
    public static void main(String[] args) {   
        //it is a part of collection framework
        //it is implemented by the list interface
        //Each element is called a node, and each node contains a data part and address part and
        //the address part of the last node contains null to indicate the end of the list.
        //Each element is linked to the next element using pointers.
        //Dynamic Size: Linked lists can grow and shrink in size as needed, whereas arrays have a fixed size.
        //Ease of Insertion/Deletion: Inserting or deleting elements in a linked list is generally more efficient than in an array, especially for large datasets.
        //Disadvantages of Linked List over Array
        //Memory Overhead: Linked lists require extra memory for storing pointers.
        LinkedList<Integer> list = new LinkedList<>();   
        list.add(10);   
        list.add(20);   
        list.add(30);
        LinkedList<String> strList = new LinkedList<>();   
        strList.add("Hello");   
        strList.add("World");
        System.out.println("Integer list: " + list);   
        System.out.println("String list: " + strList);
    }
}