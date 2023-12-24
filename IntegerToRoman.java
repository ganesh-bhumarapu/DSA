import java.util.LinkedHashMap;
import java.util.*;
class IntegerToRoman{
    static String converToRoman(int n){
        Map<String, Integer> map=new LinkedHashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);
        StringBuilder sb=new StringBuilder(); // used for effective concatination of string(mutable string)
        for(Map.Entry<String, Integer> entry: map.entrySet()){ // enhanced for loop in which entrySet() -> selects all entries in map
            while(n>=entry.getValue()){    // getValue() -> it will return the respective value of entry
                n=n-entry.getValue();
                sb.append(entry.getKey()); // getKey() -> returns the key value and add it to string
            }
        }
        return sb.toString(); //toString() -> converting mutable string to immutable string
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(converToRoman(n));
    }
}