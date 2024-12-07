import java.util.*;
public class TrieNode {

    Map <Character,TrieNode> children;
    boolean end;
    public TrieNode()
    {
        children=new HashMap<>();
        end=false;    
    }
}