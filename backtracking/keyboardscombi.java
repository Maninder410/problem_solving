package backtracking;
import java.util.*;

public class keyboardscombi {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);

    }
    static String codes[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static ArrayList<String> getKPC(String str) {
        if(str.length()== 0){
            ArrayList<String> fres = new ArrayList<>();
            fres.add("");
            return fres;
        }
        char ch = str.charAt(0);
        String restofstr = str.substring(1);
        ArrayList<String> recres = getKPC(restofstr);
        ArrayList<String> myres = new ArrayList<>();
        String idx= codes[ch-'0'];
        for(int i = 0;i<idx.length();i++){
            char temp = idx.charAt(i);
            for(String it:recres){
                myres.add(temp + it);
            }
        }
        
    return myres;
    }

}