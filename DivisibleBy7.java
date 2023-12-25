import java.util.*;
class DivisibleBy7{
    static int isDivisible7(String num){
        int i=0;
        int n=num.length();
        int res=0;
        while(i<n){
            int lastdigit=Character.getNumericValue(num.charAt(i));
            int number=res*10+lastdigit;
            res=number%7;
            i++;
        }
        if(res==0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String num=sc.nextLine();
        System.out.println(isDivisible7(num));
    }
}