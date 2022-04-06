package javaProgram;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {
	public static void main(String[] args) {
		String str = "I love coding and testing";
		//getCharCount(str, 'g');
		countCharInString(str);
		//System.out.println();
		//countCharInString("abc aa abd ere");	
	}	
	public static void getCharCount(String str, char val) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void getCharOccurance(String str) {
				
		int count = 0;
		for(char ch : str.toCharArray()) {
			if(ch == 'i') {
				count ++;
			}
		}
		System.out.println(count);
	}
	
	public static void countCharInString(String str) {
		str=str.replace(" " , "");
		char arr[] = str.toCharArray();
		
		int count = 0;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			count=0;
			for(int j=0; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			map.put(arr[i], count);
		}
		System.out.println(map);
	}
}
