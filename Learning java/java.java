//import java.util.*;

class Main {

    public static void main(String[] args) {
        int i,j;
        for(i=1;i<5;i++){
            System.out.println("i="+i);
            for(j=1;j<6;j++){
                if(i==2 || i==3) {
                    if (j==2 || j==3 || j==4){
                        System.out.print(" ");
                    }}
                else{
                    System.out.print(j);
                }
                //}
            }
            System.out.println();
        }
    }
}

