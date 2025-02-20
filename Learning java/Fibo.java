import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1,i;
        System.out.print(a+" ");
        for(i=2;i<=n;i++){
            System.out.print(b+" ");
            int temp;
            temp=b;
            b=a+b;
            a=temp;
        }
    }
}
