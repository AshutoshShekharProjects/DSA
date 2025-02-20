public class Permutations {
    public static void printPermutation(String s, String perm){
       if(s.length()==0){
           System.out.println(perm);
           return;
       }
        for(int i=0;i<s.length();i++){
           char curr=s.charAt(i);
           String newstr= s.substring(0,i) + s.substring(i+1);
           printPermutation(newstr,perm+curr);
       }
    }
    public static void main(String[] args){
        String s="abc";
        printPermutation(s,"");
    }
}
