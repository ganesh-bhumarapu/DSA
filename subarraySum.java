import java.util.ArrayList;

public class subarraySum{

    public static ArrayList<Integer> findSubarray(int[] arr, int targetSum) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int left = 0; left < arr.length; left++) {
            int currentSum = 0;

            for (int right = left; right < arr.length; right++) {
                currentSum += arr[right];

                if (currentSum == targetSum) {
                    result.add(left + 1);  // 1-based indexing
                    result.add(right + 1); // 1-based indexing
                    return result;
                } else if (currentSum > targetSum) {
                    break;  // Move to the next left index
                }
            }
        }
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int targetSum = 0;

        ArrayList<Integer> result = findSubarray(arr, targetSum);

        System.out.println("Result: " + result);
    }
}
