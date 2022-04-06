package javaProgram;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "ababbabbcabdbbb";
		System.out.println("Old String is :" +str);
		
		System.out.println("New String is : " +removeDuplicate(str));
		
	}

	public static String removeDuplicate(String str) {
		String newStr = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(newStr.indexOf(ch)==-1) {
				//newStr+=ch;
				newStr = newStr + ch;
			}
		}
		
		return newStr;
	}
}
