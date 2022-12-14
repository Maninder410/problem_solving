import java.util.*;
public class bubblesort {
    static void print(int r, int c){
        if(r==0){
            return ;
        }
        if(c<r){
            System.out.print("*");
            print(r,c+1);
        }
        else {
            System.out.println();
            print(r - 1, 0);
        }
    }
    static void print2(int r, int c){
        if(r==0){
            return ;
        }
        if(c<r){
            print2(r,c+1);
            System.out.print("*");
        }
        else {
            print2(r - 1, 0);
            System.out.println();
        }
    }
    static void bubbleSort(int arr[],int r, int c){
        if(r==0){
            return ;
        }
        if(c<r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubbleSort(arr, r, c + 1);
        }
        else {
            bubbleSort(arr,r - 1, 0);
        }
    }
    static void insertionSort(int arr[],int r, int c){
        if(r==0){
            return ;
        }
        if(c<r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;

            }
            insertionSort(arr, r, c + 1);
        }
        else {
            insertionSort(arr,r - 1, 0);
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1,0-3,8,99,92,73,83};
        int n = arr.length-1;
        bubbleSort(arr,n,0);
        System.out.println(Arrays.toString(arr));
       // int r = 5;
      //  print(r,0);
        //print2(r,0);
    }
}
