package programs;

public class primefactors {
   public static void main(String[] args) {
    int n = 88;
    int c = 2;
    while(n!=1){
        if(n%c == 0){
            System.out.print(c+" ");
            n = n/c;
        }
        else
        c++;
    }
   }
}
