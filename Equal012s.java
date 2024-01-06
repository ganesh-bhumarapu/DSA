import java.util.*;
class Equal012s{
    static long getSubstringWithEqual012(String str){
        long ans=0;
        long c0=0;
        long c1=0;
        long c2=0;
        String key=(c1-c0)+"#"+(c2-c1);
        HashMap<String, Integer> map=new HashMap<>();
        map.put(key,1);
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
            key=(c1-c0)+"#"+(c2-c0);
            if(map.containsKey(key)){
                ans+=map.get(key);
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
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