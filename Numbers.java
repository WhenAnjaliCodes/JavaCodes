import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {

    public static void sum() {
        List<String> inputStr = Arrays.asList("1", "2", "3", "4");

        List<Integer> input = new ArrayList<>();
        for (String str : inputStr) {
            input.add(Integer.parseInt(str));
        }

        int sum = input.stream()
                .filter(n -> (n % 2 != 0))
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of odd numbers: " + sum);
    }

    public static void PatterSum() {
        //  limit - 10: 1,3,6,10

        int sum = 0;
        for (int i = 1; sum < 10; i++) {
            sum += i;
            System.out.println(sum);

        }
    }

    public static void AnyEvenNumber() {
        int[] arr = new int[] {1,3,4,5,7,9};
        Boolean answer = Arrays.stream(arr).boxed()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(answer);
    }

    public static void FindNextLargestNumber(int num) {
        char[] s = Integer.toString(num).toCharArray();
        //step 1 - find th pivot =- everything to the right shud be in descending order
        int i = s.length - 2;
        while (i >= 0 && s[i] >= s[i + 1]) {
            i--;
        }
        if (i < 0) System.out.println("NextLargestNumber: Number " + num + " already at the highest permutation");
        // Step 2: Find the smallest digit greater than pivot to the right
        int j = s.length - 1;
        while (s[j] <= s[i]) {
            j--;
        }
        //Step 3: swap pivot and smallest digit
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        //Step 4: Sort the array from swapped point(pivot's old place)
        char[] subArray = Arrays.copyOfRange(s, i + 1, s.length);
        Arrays.sort(subArray);
        for (j = 0; j < subArray.length; j++) {
            s[i + 1 + j] = subArray[j];
        }
        System.out.println("NextLargestNumber:  " + Integer.parseInt(new String(s)));
    }

    public static void ShiftOnesLeft() {
        int[] arr = new int[] {1,3,5,1,7,1,9,1,1};
        int writeIndex = 0;
        int[] resArr = new int[arr.length];

        // First pass: move all 1's to the beginning
        for (int j : arr) {
            if (j == 1) {
                resArr[writeIndex++] = 1;
            }
        }

        // Second pass: write non-1 values starting from writeIndex
        for (int j : arr) {
            if (j != 1) {
                resArr[writeIndex++] = j;
            }
        }

        System.out.println(Arrays.toString(resArr));
    }

    public static void GeneratePowerSet(int n) {
        List<List<Integer>> powerSet = new ArrayList<>();
        int totalSubsets = 1 << n; // Same as 2^n

        for (int mask = 0; mask < totalSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                // Check if the i-th bit is set in mask
                if ((mask & (1 << i)) != 0) {
                    subset.add(i);
                }
            }
            powerSet.add(subset);
        }

        System.out.println("Power set of size 2^" + n + " (" + powerSet.size() + " subsets):");
        for (List<Integer> subset : powerSet) {
            System.out.println(subset);
        }
    }


}

