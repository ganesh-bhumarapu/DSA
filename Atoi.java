import java.util.*;
class Atoi{
    static int atoi(String str){
        int result=0;
        int sign=1;
        int i=0;
        if(str.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        while(i<str.length()){
            if(!(str.charAt(i)>='0' && str.charAt(i)<='9')){//if the string charcter does not lie between 0 and 9 then
                return -1;
            }
            result=result*10+(str.charAt(i)-'0');// if lies then multiply with 10 and add the character to the result
            i++;
        }
        return result*sign;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(atoi(str));
    }
}