import java.util.*;
class LongestConsecutiveOnesInString {
    public static int LongestOnes(int N) {
        int max = 0;
        int count = 0;
        String binary = Integer.toBinaryString(N);//it converts integer to binary
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
                max = Math.max(max, count);// returns maximum of the max and count
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(LongestOnes(N));
    }
}