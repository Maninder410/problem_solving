package online_class;
import java.util.*;
public class stringmatching2 {
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the main string");
        String str1 = sc.nextLine();
        System.out.println("enter the string to be found");
        String str2 = sc.nextLine();
    int n1 = str1.length();
    int n2 = str2.length();
    
    boolean found = false;
    for(int i = 0;i<n1;i++){
    
           
        if(str1.charAt(i) == str2.charAt(0)){
            int p = i;
            for(int j = 0;j<n2;j++){
                if(str1.charAt(p+j) == str2.charAt(j)){
                    found = true;
                  
                }
                else{
                    found = false;
                    break;
                }
             
            }
           if(found == true){
            System.out.println(str2+ " found at index "+ i);
           }
        }
        
    }
    if(found == false){
        System.out.println("not found");
    }
}
}
