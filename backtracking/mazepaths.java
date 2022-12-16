import java.io.*;
import java.util.*;

public class mazepaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> ans = getMazePaths(1,1,n,m);
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> rres = new ArrayList<>();
            rres.add("");
            return rres;
        }
          ArrayList<String> hpaths= new ArrayList<>();
            ArrayList<String> vpaths= new ArrayList<>();
            if(sc < dc){
              hpaths =  getMazePaths(sr,sc+1,dr,dc);
            }
             if(sr < dr){
             vpaths =   getMazePaths(sr+1,sc,dr,dc);
            }
             ArrayList<String> fres= new ArrayList<>();
             for(String hpath:hpaths){
                 fres.add("h" + hpath);
             }
             for(String vpath:vpaths){
                 fres.add("v"+vpath);
             }
             return fres;
        
    }

}