import java.util.Arrays;
import java.util.Scanner;
public class ArrayOperations {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan","Maurice"};
        Scanner inputs = new Scanner(System.in);

        //Identifying the index of a name
        System.out.print("Enter a name to find its index: ");
        String nameToFind = inputs.nextLine();
        int index = -1; 
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(nameToFind)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("The index of " + nameToFind + " is: " + index);
        } 
        else {
            System.out.println(nameToFind + " was not found in the array.");
        }
    

        //swapping two names
        System.out.println("Which names do you want to swap?");
        System.out.print("Enter the first name: ");
        String FirstName = inputs.nextLine();
        System.out.print("Enter the second name: ");
        String SecondName = inputs.nextLine();
        int firstIndex = -1;
        int secondIndex = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(FirstName)) {
                firstIndex = i;
            }
            if (names[i].equalsIgnoreCase(SecondName)) {
                secondIndex = i;
            }
        }
        if (firstIndex == -1 || secondIndex == -1) {
            System.out.println("One or both names were not found. Swap cannot be performed.");
        } 
        else {
            String swapping = names[firstIndex];
            names[firstIndex] = names[secondIndex];
            names[secondIndex] = swapping;
            System.out.println("Names after swapping:");
            for (String name : names) {
                System.out.println(name);
            }
        }


         // Sorting names in ascending order
        for (int i = 0; i < names.length - 1; i++)
        {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareToIgnoreCase(names[j]) > 0) {
                    String placement = names[i];
                    names[i] = names[j];
                    names[j] = placement;
                }
            }
        }
        System.out.println("Names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }


        // Sorting names in descending order
        for (int i = 0; i < names.length - 1; i++)
        {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareToIgnoreCase(names[j]) < 0) {
                    String placement = names[i];
                    names[i] = names[j];
                    names[j] = placement;
                }
            }
        }
        System.out.println("Names in descending order:");
        for (String name : names) {
            System.out.println(name);
        }


        // Linear Search
        System.out.print("Enter a name to search: ");
        String NametoSearch = inputs.nextLine();
        boolean found = false;
        for (String name : names) {
            if (name.equalsIgnoreCase(NametoSearch)) {
                found = true;
                break;    
            }
        }
        if (found) {
                System.out.println("Name is found");
        
        }
        else{
            System.out.println("Name is not in the array");
        }

        

        // Binary Search
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        System.out.print("Enter a name to search using binary search: ");
        String nameToSearch = inputs.nextLine();
        int left = 0;
        int right = names.length - 1;
        boolean isFound = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = nameToSearch.compareToIgnoreCase(names[mid]);
            if (result == 0) {
                isFound = true;
                break;
            }
            if (result > 0) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        if (isFound) {
            System.out.println("Name found using binary search.");
        } 
        else {
            System.out.println("Name not found using binary search.");
        }
 

    }
}
