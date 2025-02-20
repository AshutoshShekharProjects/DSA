public class Combinations {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombinations(String s, int idx, String combination){
        if(idx==s.length()){
            System.out.println(combination);
            return;
        }
        char key=s.charAt(idx);
        String mapping=keypad[key-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombinations(s,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args){
        String s="23";
        printCombinations(s,0,"");
    }
}
