import java.util.Scanner;

public class substr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email:");
        String str,newstr="";
        str = sc.next();
        int i,c = 0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i) == '@')
                c=i;
        }
        newstr = str.substring(0,c);
        System.out.println("User name is: "+newstr);
    }
}
