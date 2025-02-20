public class Rough {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void combination(String s, int idx, String combo){
        if(idx==s.length()){
            System.out.println(combo);
            return;
        }
        char key=s.charAt(idx);
        String value= keypad[key-'0'];
        for(int i=0; i<value.length(); i++){
            combination(s,idx+1, combo+value.charAt(i));
        }
    }
    public static void main(String[] args){
        String str="45";
        combination(str,0,"");
    }
}
