package javaProgram;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to JAva";
		reverseString(str);
		reverseStringblocks(str);
		

	}
	
	public static void reverseStringblocks(String str) {
		String[] words = str.split(" ");
		
		String reverseString = "";
		
		for(String w : words) {
			String reverseWord = "";
			for (int i = w.length()-1; i>=0;i--) {
				reverseWord=reverseWord+w.charAt(i);
			}
			
			reverseString = reverseString+reverseWord+ " ";
		}
		System.out.println(reverseString);
	}
	
	public static void reverseString(String str) {
		
		String reverseString = "";
		
			for (int i = str.length()-1; i>=0;i--) {
				reverseString=reverseString+str.charAt(i);
			}
			System.out.println(reverseString);
		
	}

}
