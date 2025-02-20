import java.util.Scanner;

public class PrintFibonacci {
    public static void fibo(int a, int b, int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fibo(b,c,n-1);
    }
    public static void main(String[] args){
        int a=0,b=1;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibo(a,b,n-2);
    }
}
