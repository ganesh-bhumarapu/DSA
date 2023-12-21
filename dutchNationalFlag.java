import java.util.*;
public class dutchNationalFlag {
    public static void sortArray(int []arr,int n){
        n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;
        int temp=0;
        while(mid<=high){
            switch(arr[mid]){
                case 0:{
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:{
                    temp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high--;
                }
            }
        }
    }
    public static void printArray(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortArray(arr,n);
        printArray(arr,n);

    }
}
