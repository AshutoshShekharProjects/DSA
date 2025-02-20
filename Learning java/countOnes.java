import java.util.*;

public class countOnes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println(count(i));
    }

    public static int count(int n){
        int c=0;
        while(n>0){
            c+=n&1;
            n>>=1;
        }
        return c;
    }
}
