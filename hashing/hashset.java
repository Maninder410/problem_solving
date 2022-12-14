import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        //duplicates elements are not allowed
       // Set<Integer> set = new HashSet<>();
        //works as unordered_set in c++

        //works as unordered
//        set.add(35);
//        set.add(35);
//        set.add(35);
//        set.add(65);
//        set.add(21);
//        //order is not defined i.e . it will print int random order
//        System.out.println(set);
//        System.out.println(set.contains(100));//returns true or false
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());
       // set.clear();
        //Set<Integer> set1 = new LinkedHashSet<>();
        //this will also work as unordered_set but the order of insertion will be maintained
//        set1.add(35);
//        set1.add(35);
//        set1.add(35);
//        set1.add(65);
//        set1.add(21);
//        //order of insertion is maintained but they are not sorted
//        System.out.println(set1);
        Set<Integer> set2 = new TreeSet<>();
        //this will work as set and element will be sorted in ascending order
        set2.add(35);
        set2.add(35);
        set2.add(35);
        set2.add(65);
        set2.add(21);
        System.out.println(set2);
    }
}
