import java.util.*;
class Equalpointbracket {
    static long countSub(String str) {
        int l = 0;//intialize two pointers one at the staring and another at the end
        int r = str.length() - 1;
        while (l <= r) {
            if (str.charAt(l) != '(') {//if char at l is not equal to ( increment l by 1
                l++;
            } else if (str.charAt(r) != ')') {// if char at r is not equal to ) decrement r by 1
                r--;
            } else {// if both the above cdns fail increment l by 1 and decrement r by 1
                l++;
                r--;
            }
        }
        return l;// return index value of l
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countSub(str));
    }
}
