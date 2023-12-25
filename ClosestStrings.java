import java.util.*;
public class ClosestStrings{
    static int ShortestDistance(ArrayList<String> s,String word1,String word2){
        int res1=-1;//initialize it to least value
        int res2=-1;
        int leastdist=Integer.MAX_VALUE;
        for(int i=0;i<s.size();i++){//interate each word in the list
            if(s.get(i).equals(word1)){//if element of index(i)==word1 then update it with res1
                res1=i;
            }
            if(s.get(i).equals(word2)){//similarly update it with res2
                res2=i;
            }
            if(res1!=-1 && res2!=-1){//if res1 and res2 value has any change
                leastdist=Math.min(leastdist,Math.abs(res2-res1));//perform subtraction and return positive value
            }// Math.min -> used to find minimum value possible
        }// Math.abs() -> used to covert negative to positive numbers
        return leastdist;
    }

}