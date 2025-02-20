public class PlaceTiles {
    public static int tiles(int n, int m){
        if(n<m){
            return 1;
        }
        else if(n==m){
            return 2;
        }
        //int vertical=tiles(n-m,m);
        //int horizontal=tile(n-1,m);
        return tiles(n-1,m) + tiles(n-m,m);
    }
    public static void main(String[] args){
        int n=4,m=2;
        System.out.println(tiles(n,m));
    }
}
