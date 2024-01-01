import java.util.*;
class RotatedByTwoPlaces {
    public static boolean isRotated(String s1, String s2){
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2){// if length is not equal then it return false
            return false;
        }
        if(n1<=2){// if the length is 2 then we cannot rotate it by two times
            return false;
        }
        String clockWise=s1.substring(2)+s1.substring(0,2);//substring(2)--> it returns values from second index to end of the string and substring(0,2)-> returns starting two indexes
        String antiClockWise=s1.substring(n1-1)+s1.substring(0,n1-1);//substring(n1-1)--> it returns values from n1-1 to end of the string and substring(0,n-1)-> 0 to n-2(included)
        if(s2.equals(clockWise)||s2.equals(antiClockWise)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(isRotated(s1,s2));
    }

}
