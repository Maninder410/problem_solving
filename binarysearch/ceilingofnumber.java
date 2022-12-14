import java.util.*;
public class ceilingofnumber{
    static int bs(int arr[], int target){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(target>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
        }
        return s;
        //if we change the condition to return e then we will find the greatest element less than equal to that number
    }
public static void main(String[] args) {
   
    //ceiling of a number - smallest greatest element in array or equal to target(more like lower_bound in c++)
    int arr[] = {1,4,5,8,9,13,13,13,15,16,24};
    int target =14;
    int a = bs(arr,target);
    System.out.println(a);
}
}