import java.util.Scanner;

public class Arr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int[] arr=new int[s];
        int i,n,c=0;
        for(i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the no. to search");
        n=sc.nextInt();
        for(i=0;i<s;i++){
            if(n==arr[i]){
                System.out.println("No. found at:"+(i+1));
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println("No. not found");
    }
}
