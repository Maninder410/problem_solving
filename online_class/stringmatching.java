package online_class;
import java.util.*;
public class stringmatching {
public static void main(String[] args) {
    String str1 = "abxxabksjfdklabxkdfsj";
    String str2 = "xxa";
    int n1 = str1.length();
    boolean found = false;
    for(int i = 0;i<n1;i++){
        if(i+2<n1){
           
        if(str1.charAt(i) == str2.charAt(0) && str1.charAt(i+1) == str2.charAt(1) && str1.charAt(i+2) == str2.charAt(2)){
            found = true;
            System.out.println("String found at index "+ i);
        }
        }
        
    }
    if(found == false){
        System.out.println("not found");
    }

}   
   
}
