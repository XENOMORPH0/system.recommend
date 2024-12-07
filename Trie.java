import java.util.*;
public class Trie {
    private TrieNode root;
    public Trie()
    {
        root=new TrieNode();
        // System.out.println("Trie has been created");
    }
    public void insert(String word)
    {
        TrieNode current=root;
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null)
            {
                node=new TrieNode();
                current.children.put(ch,node);
            }
            current=node;
            
        }
        // TrieNode temp=root.children.get('A').children.get('P');
        // for( Map.Entry <Character, TrieNode> e: temp.children.entrySet())
        // System.out.println(e.getKey()+" "+e.getValue());
        current.end=true;
        // System.out.println(current);
        //System.out.println("Inserted: "+word);
    }
    public List<String> search(String word)
    {
        TrieNode current=root;
        int i=0;
        List<String> l=new ArrayList<>();
        for(i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            TrieNode node=current.children.get(ch);
            if(node==null)
            {
                return l;
            }
            current=node;           
        }
        comb(word,current,l);
        return l;
       
    }
    public void comb(String s, TrieNode current,List<String> l)
    {
        if(current.end==true)
        {
            
            l.add(s);
        }
       
           for(Map.Entry<Character,TrieNode> e: current.children.entrySet())
           {
            comb(s+e.getKey(),current.children.get(e.getKey()),l);
            
           }
           return;
    } 
    public boolean delete(String s,TrieNode parent,int index)
    {
        char ch=s.charAt(index);
        TrieNode current=parent.children.get(ch);
        boolean canDelete;
        if(current.children.size()>1)
        {
            delete(s,current,index+1);
            return false;
        }
        if(index==s.length()-1)
        {
            if(current.children.size()>=1)
            {
                current.end=false;
                return false;
            }
            else
            {
                parent.children.remove(ch);
                return true;
            }
        }
        if(current.end==true)
        {
            delete(s,current,index+1);
            return false;
        }
        canDelete=delete(s,current,index+1);
        if(canDelete==true)
        {
            parent.children.remove(ch);
            return true;
        }
        else
        return false;
    } 
    // public void delete(String word)
    // {
    //     if(search(word)==true)
    //     delete(word,root,0);
    // }
 

}
