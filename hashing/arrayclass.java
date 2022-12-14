import java.util.*;
public class arrayclass {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5,8,9,10};
//        int index = Arrays.binarySearch(arr,4);
//        System.out.println(index);
      //  int arr[] = {-2,-4,-5,99,283,93,83,932,92};
//        Arrays.sort(arr);
//        Arrays.fill(arr,0);//fills the entire array with zero
//        System.out.println(Arrays.toString(arr));
        //collectionclass
    List<Integer> list = new ArrayList<>();
    list.add(35);
    list.add(-2);
    list.add(82);
    list.add(-33);
    list.add(1000);
    Collections.sort(list,Comparator.reverseOrder());//sorts in reverse order
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,82));
    }
}
