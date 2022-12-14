
import java.util.*;
public class frameworks {
    public static void main(String[] args) {
        //array list
        //arrays can not change it's size dynammically
//         ArrayList<String> std_name = new ArrayList<>();
//         std_name.add("rakesh");
//         std_name.add("maninder");
//         std_name.add("sohal");
//         std_name.add("vinay");
         //size will increase by n +n/2+1
//        System.out.println(std_name );
        ArrayList<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(35);
        list.add(38);
        list.add(39);
        list.add(/*index*/2,49/*element*/);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(83);
        list1.add(89);
        list1.add(99);
        list1.add(99);
        list1.add(99);
        list.addAll(list1);//addes all the element of list1 in list
      //  System.out.println(list.get(0));
       // System.out.println(list[0]); this is wrong syntax and will give error
     //   System.out.println(list);
        list.remove(0);//this will remove according to the index provided
     //   System.out.println(list);
        list.remove(Integer.valueOf(99));//this will remove the value of 99 only one time
        //System.out.println(list);
        list.set(3,10000);//updates  value at a given index
       // System.out.println(list);
      //  Collections.sort(list);//this will sort the list
        Collections.sort(list,Collections.reverseOrder());//this will sort the list in reverse order
        for(int i = 0;i<list.size();i++){//iterating using for loop
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("iterating using for each loop");
        for(Integer x:list){//using for each loop
            System.out.print(x+" ");
        }


        list.clear();

    }
}
