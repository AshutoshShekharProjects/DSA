import java.util.HashSet;

public class Subsequence {
    public static void uniquesubseq(String s, int idx, String ns, HashSet<String> hs){
        if(idx==s.length()){
            if(hs.contains(ns)){
                return;
            } else{
                System.out.println(ns);
                hs.add(ns);
                return;
            }
        }
        uniquesubseq(s,idx+1,ns+s.charAt(idx),hs);
        uniquesubseq(s,idx+1,ns,hs);
    }
    public static void subseq(String s, int idx, String ns){
        if(idx==s.length()){
            System.out.println(ns);
            return;
        }
        //to do
        subseq(s,idx+1,ns+s.charAt(idx));
        //not to do
        subseq(s,idx+1,ns);
    }
    public static void main(String[] args){
        String s="aaa";
        //subseq(s,0,"");
        HashSet<String> hs=new HashSet<>();
        uniquesubseq(s,0,"",hs);
    }
}
