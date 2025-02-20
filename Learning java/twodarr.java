import java.util.Scanner;

public class twodarr {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] metrix=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                metrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Metrix is:");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(metrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
