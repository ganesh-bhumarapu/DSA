import java.util.*;
class reverseString{
    static String revstring(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--) {
            result += str.charAt(i);
        }
         return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        System.out.println(revstring(str));
    }
}