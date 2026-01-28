import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        //it is a part of collection framework
        //it is implemented by the list interface
        //Dynamic array that can grow as needed
        //Allows duplicate elements
        //Maintains insertion order of elements
        // Provides random access to elements using index but linked list doesn't provide that
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits: " + fruits);
    }
}