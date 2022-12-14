package programs;

public class hcf {
    public static int __gcd(int a, int b){
        if(a == 0)
        return b;
       else if(b == 0)
        return a;
       else if(a == b)
        return b;
        else if(a>b)
        return __gcd(a-b,b);

        return __gcd(a,b-a);
    }
    public static void main(String[] args) {
        int a = 45;
        int b = 185;
        int x = __gcd(a,b); 
        System.out.println(x);
    }
}
