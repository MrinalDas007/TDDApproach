/*
 * https://www.youtube.com/watch?v=Xc3d6j8Rm_I
 */
package main;

public class StringHelper {

	public String swapLast2Chars(String str) {
		//Commit 1
		//char firstChar = str.charAt(0);
		//char secondChar = str.charAt(1);
		//return "" + secondChar + firstChar;
		
		//Commit 2
		//int len = str.length();
		//String str2 = str.substring(0,len-2);
		//char secondLastChar = str.charAt(len-2);
		//char LastChar = str.charAt(len-1);
		//return str2 + LastChar + secondLastChar;
		
		//Commit 3
		int len = str.length();
		if(len<2)
			return str;
		String str2 = str.substring(0,len-2);
		char secondLastChar = str.charAt(len-2);
		char LastChar = str.charAt(len-1);
		return str2 + LastChar + secondLastChar;
	}

}
