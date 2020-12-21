import java.io.File;
import java.util.Scanner;

public class stairway { // implementing top-down approach
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("input6.txt"));//reading file
            String str = sc.nextLine();
           int val = Integer.parseInt(str);
            System.out.println("  " + Stairway(val));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int Stairway(int n) {
        int[] arr = new int[n + 1]; // creating the array for the memoization
        for (int i = 0; i < n + 1; i++) { // filling the array with -1 to keep track if there is no value in the array first
            arr[i] = -1;
        }
        return stair(n, arr); // recursive call
    }

    public static int stair(int n, int[] val) { //helper method 
        if (n <= 1) // base case
            return 1;
        if (val[n] != -1)
            return val[n];
        val[n] = stair(n - 1, val) + stair(n - 2, val); // recursive call, need only if there is no answer
        return val[n];
    }
}
