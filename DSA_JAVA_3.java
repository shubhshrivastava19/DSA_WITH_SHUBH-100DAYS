// group anagram strs = ["eat","tea","tan","ate","nat","bat"]
// usign sorting + hashmap
import java.util.*;
class DSA_JAVA_3{
    public static void main(String[]args){
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        GroupAnagram(strs);
        
    }
    public static void GroupAnagram(String [] strs)
    {
        HashMap <String,List<String>> dc = new HashMap <>();
        for(String str : strs){
            String temp = str;
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            dc.putIfAbsent(sortedStr,new ArrayList<>());
            dc.get(sortedStr).add(temp);
        }

        System.out.println("this is the hashmap data");
        System.out.println(dc.values());
    }
}