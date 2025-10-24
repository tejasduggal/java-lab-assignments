import java.util.*;

public class searcharray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        Set<Integer> uniqueNumbers = new HashSet<>();

        
        while (uniqueNumbers.size() < 100) {
            uniqueNumbers.add(rand.nextInt(1000)); 
        }

        int index = 0;
        for (int num : uniqueNumbers) {
            arr[index++] = num;
        }

        System.out.println("Generated Array:");
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number (<1000) to search: ");
        int target = sc.nextInt();

        int foundIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                foundIndex = i;
                break;
            }
        }

        
        if (foundIndex != -1) {
            System.out.println(" Number " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }

        sc.close();
    }
}

