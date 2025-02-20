public class Trie {
    public static class Node {
        Node[] children;
        boolean eow;

        Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null) {
                return false;
            }
            if (i == word.length() - 1 && node.eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if (search(firstPart) && wordBreak(secondPart)) {
                return true;
            }
        }
        return false;
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countNode(Node root) {
        int c = 0;
        if (root == null) {
            return 0;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                c += countNode(root.children[i]);
            }
        }
        return c + 1;
    }

    public static String ans="";
    public static void longestWord(Node root, StringBuilder temp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow){
                temp.append((char)(i+'a'));
                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestWord(root.children[i],temp);
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String args[]) {
        /*
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println("thee -> " + search("their"));
        System.out.println("thor -> " + search("thor"));
        System.out.println("an ->" + search("an")); */
        /*
        String words[] = {"i","like","samsung","mobile","sam"};
        String key="ilikesamsung";
        String key2="ilikesam";
        String key3="ilikesung";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(wordBreak(key));
        System.out.println(wordBreak(key2));
        System.out.println(wordBreak(key3));*/
        /*
        String words[] = {"apple","app","mango","man","woman"};
        String prefix="app";
        String prefix2="man";
        String prefix3="moon";
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(startsWith(prefix));
        System.out.println(startsWith(prefix2));
        System.out.println(startsWith(prefix3));*/
        /*
        String str = "apple";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println(countNode(root));*/

        String[] words={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root,new StringBuilder());
        System.out.println(ans);
    }
}
