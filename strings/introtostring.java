package strings;
import java.util.Scanner;
public class introtostring {
    //do remember that strings are immutable in java
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s1 = sc.nextLine();
        // String s2 = sc.nextLine();
// System.out.println(s1+""+s2);
String s = "abcde";
//System.out.println(s.substring(0,3));
//(beginning index,endingindex)
//if(0,n) is passed then it will give string from (0,n-1);
//ifs.substring(n) is passed then it will print all the substring from that point
// for(int i = 0;i<s.length();i++){
//     for(int j = i+1;j<+s.length();j++){
//         System.out.println(s.substring(i, j));
//     }
// }
// String st1 = "abcdef";
// st1+='c';
// st1+=10;
// System.out.println(st1);
//we can also add integer in a string
//adding two strings just like c++,using + operator
//using split function we can remove spaces from a given string
// String s1 = "today is a good day because i ate my favourite food";
// System.out.println(s1);
// String words[] = s1.split(" ");
// for(String x:words){
//     System.out.println(x);
// }
String str1 = "hello";
String str2 = "hello";
String str3 = new String("hello");
System.out.println(str1 == str2);
System.out.println(str1 == str3);
//although str1 and str3 are equal but it is giving false because == only checks for the memory
//and if it founds that the memory is diffrent then it will not check further 
System.out.println(str1.equals(str3));//this will not return false after checking the memory
//but it will also match the entire string character by character
    }
   //strings are immutable due to interning
   //what is interning - it is done to save space i.e if two strings have same name then they will be pointing 
   //to one object only
   //in java , reference of string is mutable but we cannot change it characters
    //e.g string str = "abc";
    //str = "def", this is possible but str.charAt[2] = 'z' is not possible 
}
