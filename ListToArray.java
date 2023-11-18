package learning.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
        // Create a List of Strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Convert the List to an array
        String[] stringArray = stringList.toArray(new String[0]);

        // Display the original List
        System.out.println("Original List: " + stringList);

        // Display the converted array
        System.out.println("Converted Array: " + Arrays.toString(stringArray));
    }

}
