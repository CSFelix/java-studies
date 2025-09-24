import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

//  *************
//  ** Methods **
//  *************
//
//  - get: returns the element from a given index;
//  - add: adds the element at the end of the data structure;
//  - set: updates the element at a given index;
//  - contains: checks if the data structure contains a given value;
//  - remove: removes the element at a given index;
//  - clear: removes all elements;
//  - size: returns the data structure size (amount of current stored elements);
//  - put: adds a key-value pair into a Map;
//  - keySet: returns all keys from a Map;
//  - values: returns all values from a Map;
//  - addFirst: adds an element at the beginning of the Linked structure;
//  - addLast: adds an element at the end of the Linked structure;
//  - removeFirst: removes the first element of the Linked structure;
//  - removeLast: removes the last element of the Linked structure;
//  - getFirst: returns the first element of the Linked structure;
//  - getLast: returns the last element of the Linked structure;
//
class Program {
  public static void main(String... args) {
    //  ***********
    //  ** Lists **
    //  ***********
    //
    //  - definition:
    //    \ are like arrays, but their size is dinamically adjusted. In reality, when the size is changed, the previous array is replaced by a new one with the new size;
    //    \ sorted;
    //    \ can contain duplicates;
    //
    //  - ArrayList: great to manipulate data. We also can specify a start size;
    //  - LinkedList: great to insert and remove data. The elements points to the next one;
    //
    List<String> characters1 = new ArrayList<>();
    characters1.add("Goku");
    characters1.add("Vegeta");
    characters1.add("Broly");
    System.out.println("- Array List: " + characters1);

    List<String> characters2 = new LinkedList<>();
    characters2.add("Goku");
    characters2.add("Vegeta");
    characters2.add("Broly");
    System.out.println("- Linked List: " + characters2);

    //  **********
    //  ** Sets **
    //  **********
    //
    //  - definition:
    //    \ they are like Lists, but they cannot contain duplicates. Adding duplicates automatically overrides the existing value;
    //    \ can be sorted;
    //
    //  - HashSet: the data isn't sorted;
    //  - LinkedHashSet: the data is sorted by the order they have been added;
    //  - TreeSet: the data is sorted in natural order;
    //
    System.out.println("\n---\n");

    Set<String> characters3 = new HashSet<>();
    characters3.add("Goku");
    characters3.add("Vegeta");
    characters3.add("Broly");
    System.out.println("- Hash Set: " + characters3);

    Set<String> characters4 = new LinkedHashSet<>();
    characters4.add("Goku");
    characters4.add("Vegeta");
    characters4.add("Broly");
    System.out.println("- Linked Hash Set: " + characters4);

    Set<String> characters5 = new TreeSet<>();
    characters5.add("Goku");
    characters5.add("Vegeta");
    characters5.add("Broly");
    System.out.println("- Tree Set: " + characters5);

    //  **********
    //  ** Maps **
    //  **********
    //
    //  - definition:
    //    \ the data is stored by key-value pairs;
    //    \ can be sorted;
    //
    //  - HashMap: the data isn't sorted;
    //  - LinkedHashMap: the data is sorted by the order they have been added;
    //  - TreeMap: the data is sorted in natural order using the key;
    //
    System.out.println("\n---\n");

    Map<Integer, String> characters6 = new HashMap<>();
    characters6.put(2, "Goku");
    characters6.put(0, "Vegeta");
    characters6.put(1, "Broly");
    System.out.println("- Hash Map: " + characters6);

    Map<Integer, String> characters7 = new LinkedHashMap<>();
    characters7.put(2, "Goku");
    characters7.put(0, "Vegeta");
    characters7.put(1, "Broly");
    System.out.println("- Linked Hash Map: " + characters7);

    Map<Integer, String> characters8 = new TreeMap<>();
    characters8.put(2, "Goku");
    characters8.put(0, "Vegeta");
    characters8.put(1, "Broly");
    System.out.println("- Tree Map: " + characters8);
  }
}