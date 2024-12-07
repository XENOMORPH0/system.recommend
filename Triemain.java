import java.util.*;
public class TrieMain 
{
    public static void main(String[] args) 
    {
        Trie newTrie=new Trie();
        newTrie.insert("APRS");
        newTrie.insert("BPMS");
        newTrie.insert("mobile");newTrie.insert("mouse");newTrie.insert("moneypot");newTrie.insert("monitor");
        newTrie.insert("mouspad");newTrie.insert("monster");newTrie.insert("sushil");newTrie.insert("sushhiksha");
        newTrie.insert("spear");newTrie.insert("sushumna");newTrie.insert("Advit");newTrie.insert("Akshat");newTrie.insert("Ananya");
        //newTrie.delete("sushil");
        newTrie.insert("Munna");newTrie.insert("Mama");
        System.out.println(newTrie.search("M"));
        String s="P";
        System.out.println(s.substring(1)); 
    }
}