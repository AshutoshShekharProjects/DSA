import java.util.*;

public class replace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name,result="";
        name=sc.nextLine();
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == 'e' || name.charAt(i) == 'E')
                result +='i';
            else
                result +=name.charAt(i);
        }
        System.out.println("New name is: "+result);
    }
}
