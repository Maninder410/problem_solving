import java.io.*;
import java.util.*;

public class subsequence{

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> l1 = new ArrayList<>();
            l1.add("");
            return l1;
        }
        char ch = str.charAt(0);
        String remstring = str.substring(1);
        ArrayList<String> rstr = gss(remstring);
        ArrayList<String> flist = new ArrayList<>();
        for(String x:rstr){
            flist.add(""+x);
        }
         for(String y:rstr){
            flist.add(ch+y);
        }
        return flist;
    }

}