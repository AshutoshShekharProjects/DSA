import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length()/2;i++){
            //int front=i;
            int back=sb.length()-1-i;
            char fv=sb.charAt(i);
            char bv=sb.charAt(back);
            sb.setCharAt(i,bv);
            sb.setCharAt(back,fv);
        }
        System.out.println(sb);
    }
}
