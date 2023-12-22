import java.util.*;
public class reverseWordsInString {
    static String reverseWords(String S) {
        String[] words = S.split("\\.");//symbol("\\.") -> used for separating words at '.'
        StringBuilder sb = new StringBuilder();//using this we can modify string like concatination
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(".");
        }
        return sb.toString().replaceAll("\\.$", "");//toString() -> conversion from mutable string to string.
        //replaceAll -> used to replace the gaps with required symbol or to remove from string.
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String res=reverseWords(S);
        System.out.println(res);
        sc.close();
    }
}