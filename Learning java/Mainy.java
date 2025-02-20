public class Mainy {
    public static void main(String[] args) {
        int i, j, n = 5;
        for (i = 1; i <= n; i++) {
            int space=n-i;
            for(j=1;j<=space;j++){
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        i=200;
        j=100;
        String s=Integer.toString(i);
        System.out.println(s.length());
        j+=Integer.parseInt(s);
        System.out.println(j);
    }
}



