import java.util.*;
public class selectionsort {
static void selectionSort(int arr[]){
    for (int i = 0; i < arr.length - 1; i++)
    {
        int index = i;
        for (int j = i + 1; j < arr.length; j++){
            if (arr[j] < arr[index]){
                index = j;//searching for lowest index
            }
        }
        int smallerNumber = arr[index];
        arr[index] = arr[i];
        arr[i] = smallerNumber;
    }

}
    public static void main(String[] args) {
        //selection sort is also known as positional sort
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
    for(int i = 0;i<n;i++){
        arr[i] = s.nextInt();
    }
        System.out.println("array elements before sorting");
    for(int i = 0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
        System.out.println();
        selectionSort(arr);
        System.out.println("array elements after sorting");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
