import java.util.HashSet;
import java.util.Set;

class SetAndHashsetExample {
    public static void main(String[] args) {
        System.out.println("set and hashset example");

        //set is an interface and hashset is a class that implements set interface
        //set handles the collection of objects in a more efficient way by eliminating duplicate values and
        //providing faster access to elements
        //hashset handles the collection of objects using a hash table
        //hashtable is a data structure that uses a hash function to map keys to values and
        //provides constant time performance for basic operations like add, remove, and contains

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Duplicate element, will not be added
        System.out.println("Set elements: " + set);
        //difference between list and set is list allows duplicate elements but set does not allow duplicate elements
        //set does not maintain the insertion order
        //hashset is not synchronized, if multiple threads access a hashset concurrently, 
        //and at least one of the threads modifies the set, it must be synchronized externally
        //hashset allows null elements
    }
}