package learning.java;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringArrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        stringArrayList.add("Apple");
        stringArrayList.add("Banana");
        stringArrayList.add("Orange");
        stringArrayList.add("Grapes");

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + stringArrayList);

        // Remove all elements from the ArrayList
        stringArrayList.clear();

        // Display the ArrayList after removing all elements
        System.out.println("ArrayList after removing all elements: " + stringArrayList);
    }

}
