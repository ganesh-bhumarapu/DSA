import java.util.*;
public class RomanToInteger {
    static int romanToInteger(String str) {
        Map<Character, Integer> map = new HashMap<>();//maping the given content wrt values
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = map.get(str.charAt(str.length() - 1)); //selecting last element i.e from right to left
        for (int i = str.length() - 2; i >= 0; i--) {    //iterate from right 2nd element
            if (map.get(str.charAt(i)) < map.get(str.charAt(i + 1))) {  //if element is present at left subtract
                result -= map.get(str.charAt(i));
            } else {
                result += map.get(str.charAt(i));  // element at right side add to result
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = romanToInteger(str);
        System.out.println(res);
    }
}