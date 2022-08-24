import java.util.*;
public class orderagnosticbinarysearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched : ");
        int n = sc.nextInt();
        System.out.println("Enter the size of the array :");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter the array elements: ");
        for(int i =0 ; i<s;i++){
            arr[i] = sc.nextInt();
        }
        int start =0,end=s-1,mid=0;
        boolean isAsc = false;
        if(arr[start] < arr[end])
        isAsc = true;
        else
        isAsc = false;


        while(start<=end){
            mid = start+(end-start)/2;
        
        if (isAsc == true) {
            if(n>arr[mid])
            start = mid + 1;
            else
            end = mid -1;

        }
        else {
            if(n>arr[mid])
            end = mid - 1;
            else
            start = mid -1;
        }
        if(n == arr[mid] ){
            System.out.println("Element found at index " + mid);
            break;
        }
        }
     if(start > end){
     System.out.println("element not  found");}
    }
}
