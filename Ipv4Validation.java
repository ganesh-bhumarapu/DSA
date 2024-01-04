import java.util.*;
class Ipv4Validation{
    static boolean isValid(String s){
        if(s.endsWith(".")){// checks if the string ends with "."
            return false;
        }
        String[] segments=s.split("\\.");//splits the character at "."
        if(segments.length==4){
            for(String segment : segments){// for traversing through segments array the segment represents the one segment of IP address
                try{
                    int segmentValue=Integer.parseInt(segment);//converts each segment to an integer using Integer.parseInt(segment)
                    if(!segment.equals(Integer.toString(segmentValue))){//checks if the original segment string is equal to its string representation after conversion to integer
                        return false;// this cdn helps ensure that there is no leading zeroes in each segment.if present returns false
                    }
                    if(segmentValue<0 || segmentValue>255){
                        return false;
                    }
                }catch(NumberFormatException e){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}