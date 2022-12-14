import java.util.Scanner;
public class palindrome {
    static boolean isPalindrome(String s){
    int i = 0;
    int j = s.length()-1;
    while(i<=j){
        if(s.charAt(i) == s.charAt(j)){
            i++;
            j--; 
        }
        else{
            return false;
        }  
    }
    return true;
    
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("please enter the number");
        System.out.println("please enter the string");
    String str1 = sc.nextLine();
       // int n = sc.nextInt();
       // String str = String.valueOf(n);
     
      //  System.out.println(str);
      if(isPalindrome(str1)){
        System.out.println("given number/string is palindrome");
      }
      else{
    System.out.println("given number/string is not palindrome");
      }
        
    }
}
