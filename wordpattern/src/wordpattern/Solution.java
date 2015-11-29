package wordpattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
    public boolean wordPattern(String pattern, String str) {
    	char[] chars = pattern.toCharArray();
    	char c;
    	String[] words = str.split(" ");
    	boolean cont = true;
    	Map<String, String> patmap = new HashMap<>();
    
    	if (chars.length != words.length) return false;
    	for(int x =0 ; x < words.length; x++)
    	{
    		//check if the word doesn't already exist patmap.containsValue(words[x])
    		//patmap.containsKey(String.valueOf(chars[x]))
    		if(!patmap.containsKey(String.valueOf(chars[x]))) {
    			//check for value under anotherkey
    			if (patmap.containsValue(words[x]) ) return false;
    			patmap.put( String.valueOf(chars[x]) , words[x]);
    		}else{
    			System.out.println(patmap.get(String.valueOf(chars[x])));
    			System.out.println(words[x]);
    			if(!words[x].equals(patmap.get(String.valueOf(chars[x])))  ) return false;
    		}
    		
    	}
    	return true;
    }
}
