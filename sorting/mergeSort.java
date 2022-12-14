import java.util.*;
public class mergeSort {
    static int[] merge(int first[],int second[]){
        //inplace merge sort
        int mix[] = new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[i]){
                mix[k++] = first[i++];
            }
            else {
                mix[k++] = second[j++];
            }
        }//
        while(i<first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while(j<second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }
static int[] MergeSort(int arr[]){
    if(arr.length == 1){
        return arr;
    }
    int mid = arr.length/2;
    int left[] = MergeSort(Arrays.copyOfRange(arr,0,mid));
    int right[] = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));
    int ans[] = merge(left,right);
    return ans;
}
    public static void main(String[] args) {
int arr[] = {5,4,3,2,1};
arr = MergeSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
