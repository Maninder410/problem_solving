import java.util.HashMap;
import java.util.Map;
public class hashmap {
    public static void main(String[] args) {
       // HashMap<Integer,Integer> hs = new HashMap<>();
        Map<String,Integer> numbers  = new HashMap<>();
        //works as unordered_map
        numbers.put("one",1);
        numbers.put("two",2);
        numbers.put("three",3);
//        if(!numbers.containsKey("two")){
//            numbers.put("three",23);
//        }
        numbers.putIfAbsent("two",55);
        numbers.putIfAbsent("eight",83);
        //numbers.put("three",83); //this will override the value as the keys are same
        //System.out.println(numbers);
//        for(Integer value:numbers.values()){
//            System.out.println(value);
//        }
//        for(String key:numbers.keySet()){
//            System.out.println(key);
//        }
        System.out.println(numbers.containsKey(""));
        System.out.println(numbers);
        //stores key-value pair

    }
}
