package com.sreenu.DataStructures.hackerrank.smartInterviews.Trie;
/*
* Time Complexity: O(N * M), where M is the maximum length of the string
* Auxiliary Space: O(N * 256)
* https://www.geeksforgeeks.org/spell-checker-using-trie/
*/
public class SpellCheckerUsingTrie {
    static class TrieNode{
        TrieNode trie[];
        boolean isEnd ;
        public TrieNode(){
            trie = new TrieNode[256];
            for (int i = 0; i < 256; i++) {
            trie[i] = null;
            }
            isEnd = false;
        }
    }
    static void InsertTrie(TrieNode root,String s){
        TrieNode temp = root;
        for (int i = 0; i < s.length(); i++) {
            if(temp.trie[s.charAt(i)] == null){
                temp.trie[s.charAt(i)] = new TrieNode();
            }
            temp = temp.trie[s.charAt(i)];
        }
        temp.isEnd = true;
    }
    static void printSuggestion(TrieNode root,String res){
        if (root.isEnd == true)
            System.out.println(res+"");
        for (int i = 0; i <256 ; i++) {
            if (root.trie[i]!=null){
                res+=(char)i;
                printSuggestion(root.trie[i],res );
                res = res.substring(0,res.length()-2);
            }
        }
    }
    static boolean checkPresent(TrieNode root,String key){
        for (int i = 0; i <key.length() ; i++) {
            if (root.trie[key.charAt(i)] ==null){
                printSuggestion(root,key.substring(0,i));
                return false;
            }
            root = root.trie[key.charAt(i)];
        }
        if (root.isEnd == true)
            return true;
        printSuggestion(root,key);
        return false;
    }

    public static void main(String[] args) {
        String str[] = { "gee", "geeks", "ape", "apple",
                "geeksforgeeks" };

        String key = "geek";

        // Initialize a Trie
        TrieNode root = new TrieNode();

        // Insert strings to trie
        for(int i = 0; i < str.length; i++)
        {
            InsertTrie(root, str[i]);
        }

        if (checkPresent(root, key))
        {
            System.out.println("YES");
        }
    }
}
