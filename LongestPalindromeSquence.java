import java.util.*;
class LongestPalindromeSquence{
    // it is for longest palindrome sequence
    static int lps(String str,int start,int end) {
        if (start > end) {// there is no string
            return 0;
        }
        if (start == end) {// string of length 1
            return 1;
        }
        if (str.charAt(start) == str.charAt(end)) {// if starting and ending character are same then remove those two elements from string and again
            return 2+lps(str, start + 1, end - 1);// perform the lps method recursively and add +2 for the result
        } else {
            return  Math.max(lps(str, start + 1, end), lps(str, start, end - 1));//find the max value if the characters at strating and ending are not equal
        }

    }
    static int lpsTopDown(String str,int start,int end,Integer[][] arr){//creating dynamic 2D array of the size n
        if(start>end){
            return 0;
        }
        if(start==end){
            return 1;
        }
        if(arr[start][end]==null){//at intial Integer starts all null values if the start and end are null then
            if(str.charAt(start)==str.charAt(end)){
                arr[start][end]=2+lpsTopDown(str,start+1,end-1,arr);//it is same as recursive method only difference is
            }
            else{// we willl store every value which  we get in array this makes the decrease in the time complexity
                arr[start][end]=Math.max(lpsTopDown(str,start+1,end,arr),(str,start,end-1,arr));
            }
        }
        return arr[start][end];
    }
    static int lpsBottomUp(String str,int n){
        int[][] arr=new int[n][n];
        for(int i=n-2;i>=0;i--){// i value is based on string length
            for(int j=i+1;j<n;j++){// j value is based on i and i is compared with j till last
                if(str.charAt(i)==str.charAt(j)){
                    arr[i][j]=2+arr[i+1][j-1];
                }
                else{
                    arr[i][j]=Math.max(arr[i+1][j],arr[i][j-1]);
                }
            }
        }
        return arr[0][n-1];// returns first row last column value
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(lps(str,0,str.length()-1));
        System.out.println(lpsTopDown(str,0,str.length()-1,));
        System.out.println(str,n);
    }
}