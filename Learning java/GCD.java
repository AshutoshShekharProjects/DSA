import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print(gcd2(n,m));
    }

    public static int gcd(int n, int m) {
        int num;
        if(n<m){
            num = n;
        }
        else{
            num = m;
        }
        while(num>0){
            if(n%num==0 && m%num==0){
                break;
            }
            num--;
        }
        return num;
        }

        public static int gcd2(int n, int m){
        if(n==0)
            return m;
        if(m==0)
            return n;
        if(n==m)
            return n;
        if(n>m)
            return gcd2(n-m,m);
        return gcd2(n,m-n);
        }
    }

