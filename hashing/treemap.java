import java.util.TreeMap;
import java.util.Map;

public class treemap {
    public static void main(String[] args) {

        Map<Integer,Integer> tm = new TreeMap<>();
        //keys will be stored in sorted order just like map in c++
        tm.putIfAbsent(1,2);
        tm.putIfAbsent(3,2);
        tm.putIfAbsent(4,2);
        tm.putIfAbsent(5,2);
        tm.putIfAbsent(6,2);
        tm.putIfAbsent(88,92);
        tm.putIfAbsent(87,2);
        System.out.println(tm);

    }
}
