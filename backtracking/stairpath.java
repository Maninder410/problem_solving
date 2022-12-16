import java.io.*;
import java.util.*;

public class stairpath {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> ans = getStairPaths(n);
    System.out.println(ans);
  }

  public static ArrayList<String> getStairPaths(int n) {
    if (n == 0) {
      ArrayList<String> ans = new ArrayList<>();
      ans.add("");
      return ans;
    }
    if (n < 0) {
      ArrayList<String> ans = new ArrayList<>();
      return ans;
    }
    ArrayList<String> path1 = getStairPaths(n - 1);
    ArrayList<String> path2 = getStairPaths(n - 2);
    ArrayList<String> path3 = getStairPaths(n - 3);
    ArrayList<String> allpaths = new ArrayList<>();
    for (String s1 : path1) {
      allpaths.add(1 + s1);
    }
    for (String s2 : path2) {
      allpaths.add(2 + s2);
    }
    for (String s3 : path3) {
      allpaths.add(3 + s3);
    }
    return allpaths;

  }

}