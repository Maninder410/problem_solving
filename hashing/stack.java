import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("lion");
        st.push("hyna");
        st.push("dog");
        st.push("snake");
        st.push("horse");
        System.out.println(st.peek());//prints the top element
         st.pop();
        System.out.println(st);//printing this way will only show the elements in inserted order
        // while(!st.empty()){
        //     System.out.println(st.peek());
        //     st.pop();
        // }
    }
}
