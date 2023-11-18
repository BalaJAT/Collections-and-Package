package learning.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class TreeMAP {
	public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add some employee data to the TreeMap
        employeeMap.put(100, "Vikram");
        employeeMap.put(200, "Leo");
        employeeMap.put(300, "Bala");
        employeeMap.put(400, "karthi");

        // Get all the employee names from the TreeMap
        Collection<String> employeeNames = employeeMap.values();

        // Sort the employee names in alphabetical order
        List<String> sortedEmployeeNames = new ArrayList<>(employeeNames);
        Collections.sort(sortedEmployeeNames);

        // Print the sorted employee names
        for (String employeeName : sortedEmployeeNames) {
            System.out.println(employeeName);
        }
    }
}
