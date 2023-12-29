import java.util.*;

class IsomorphicStrings{
    public static boolean isIsomorphicString(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        Map<Character,Character> ch=new HashMap<>();// for mapping str1 with str2
        for(int i=0;i<str1.length();i++){
            char original=str1.charAt(i);
            char replacement=str2.charAt(i);
            if(!ch.containsKey(original)){// it checks whether the original character is present in the hashmap or not if it is not present it add to hashmap
                if(!ch.containsValue(replacement)){// it checks the replacement character is present in the hashmap or not if it is not present it add to hashmap
                    ch.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{// if the character in original is already in hashmap then
                char mappedChar=ch.get(original);// it retrives the character from original that is already in present in the hashmap by use get() method
                if(mappedChar!=replacement){// if the retrived character from the original does not match with replacement character that is already present in the hashmap
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        System.out.println(isIsomorphicString(str1,str2));
    }
}