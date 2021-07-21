/*
 * https://www.youtube.com/watch?v=Xc3d6j8Rm_I
 */
package main;

public class StringHelper {

	public String swapLast2Chars(String str) {
		//Commit 1
		char firstChar = str.charAt(0);
		char secondChar = str.charAt(1);
		return "" + secondChar + firstChar;
	}

}
