import java.util.*;
class encryptTheString{
    static String convertToHex(int num){
        StringBuilder temp = new StringBuilder();// for efficient concatination
        while (num != 0) {
            int rem = num % 16;
            char c;
            if (rem < 10) {
                c = (char) (rem + 48);
            }
            else {
                c = (char) (rem + 87);
            }
            temp.append(c);
            num = num / 16;//num value is used for 2nd iteration
        }
        return temp.toString();// converting stringBuilder to string
    }
    static String encryptString(String S, int N){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < N; i++) {//traversing through each element in string
            char ch = S.charAt(i);//initializing ch to starting char in string
            int count = 0;
            String hex;//stores hexadecimal value
            while (i < N && S.charAt(i) == ch) {//increments count value until the char in i equals to ch
                count++;
                i++;//increments i to check the whole string until the while cdn satisfied
            }
            i--;//decrement by 1 because i value will be 1 value ahead when it fails the while cdn
            hex = convertToHex(count);//converts the count value by converting it into hexadecimal value
            ans.append(ch);//it adds character to ans
            ans.append(hex);//it adds hex value with char ans
        }
        ans.reverse();//reverse() -> it is used to reverse the stringBuilder exclusively
        return ans.toString();//converts back to string
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int N = S.length();
        System.out.println(encryptString(S, N));
    }
}
