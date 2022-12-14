public class recursionprograms {
  static int sum = 0;
    static int fact(int n){
        if(n<=1){
            return n;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n+ sum(n-1);
    }
    static int sumOfDigit(int n,int sum){
        if(n <= 0){
            return sum;
        }
       // return n%10;
        sum+=n%10;
       return sumOfDigit(n/10,sum);
    }
    static int digitsum(int n){
        if(n == 0)
            return 0;
        return n%10 + digitsum(n/10);

    }
    static int digitproduct(int n){
        if(n == 0)
            return 1;
        return n%10*digitproduct(n/10);

    }
    static void rev(int n){
        if(n == 0)
            return ;
    //int digit = n%10;
    sum = sum*10 + n%10;
    rev(n/10);
    }

    public static void main(String[] args) {
        int n = 352;
        rev(n);
       // System.out.println(fact(n));
        //System.out.println(sum(n));
        //int sum = 0;
       // System.out.println(sumOfDigit(n,sum));
        //System.out.println(digitproduct(n));
       // System.out.println(rev(n));
        System.out.println(sum);
    }

}
