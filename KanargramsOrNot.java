import java.util.*;
class KanargramsOrNot{
    static boolean areKanagrams(String s1,String s2,int k){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();//here map is used to count the occurrence of each character in the first string s1
        for(int i=0;i<s1.length();i++){// map.getOrDefault(ch,0)-> this part retrives the current count of the character ch from the map.if character not present return default value of 0.
            char ch=s1.charAt(i);// map.getOrDefault(ch,0)+1 -> this part adds 1 to the current count of the character ch from the map.if the character is not present,it starts with a count of 0 and adds 1.
            map.put(ch,map.getOrDefault(ch,0)+1);//map.put(map.getOrDefault(ch,0)+1) -> this updates the count of the character ch in the map.
        }// if the character is already present,it replaces the old count with new count(increment by1).if ch is not present ,it adds the characyer to the map with a count of 1.
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(map.getOrDefault(ch,0)>0){// this part checks whether the count of the current character is greater than 0.
                map.put(ch,map.get(ch)-1);// if cdn is true it decrements the countof the character by 1
            }
        }
        int count=0;
        for(char ch: map.keySet()){// this loop iterates over each unique character .the KeySet() method returns a set of all keys(characters in this case) in the map.
            count+=map.get(ch);//it counts the occurance of the each character in the hashmap.
        }
        if(count>k)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int k=sc.nextInt();
        System.out.println(areKanagrams(s1,s2,k));
    }
}