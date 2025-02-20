//import java.util.*;

class learning {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<5;i++){
            for(j=1;j<6;j++){
                if(i==2 || i==3) {
                    if (j==1 || j==5){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");
                }
                //}                
            }
            System.out.println();
        }
    }
}

