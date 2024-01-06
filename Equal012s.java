import java.util.*;
class Equal012s{
    static long getSubstringWithEqual012(String str){
        long ans=0;
        long c0=0;
        long c1=0;
        long c2=0;
        String key=(c1-c0)+"#"+(c2-c1);// this will contain the expression i.e ex: 1#2
        HashMap<String, Integer> map=new HashMap<>();
        map.put(key,1);// key value will represent the how many time the key expression occured in the string
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0'){
                c0++;
            }
            else if(ch=='1'){
                c1++;
            }
            else{
                c2++;
            }
            key=(c1-c0)+"#"+(c2-c0);// evaluate the expression based on the above count
            if(map.containsKey(key)){// if the evaluated expression is already present  in the map then
                ans+=map.get(key);// update the ans with key value i.e the expression count
                map.put(key,map.get(key)+1);// and update the key value by 1 as it is occured again
            }
            else{
                map.put(key,1);// if the expression is not present in the map then add the expression to the map
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(getSubstringWithEqual012(str));
    }
}