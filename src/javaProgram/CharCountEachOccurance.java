package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class CharCountEachOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCharCount("Kulsum Bhavin aa bba aa");

	}
	
	
	public static void getCharCount(String name) {
		Map<Character, Integer> charMap = new HashMap<>();
		name = name.replace(" " , "");
		char strArray[] = name.toCharArray();
		
		for(char c : strArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c,  charMap.get(c)+1);
			}
			else {
				charMap.put(c,  1);
			}
		}
		System.out.println(name + " : " +charMap);
		
	}

}
