import java.util.*;
class LicenseKeyFormatting{
    static String ReFormatString(String s,int k){
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-'){
                continue;
            }
            if(count==k){
                sb.append('-');
                count=0;
            }
            sb.append(s.charAt(i));
            count++;
        }
        return sb.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        System.out.println(ReFormatString(s,k));
    }

}