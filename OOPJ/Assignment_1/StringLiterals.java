// Java Program to Separate the
// Individual Characters from a String

import java.io.*;

public class StringLiterals{
	public static void main(String[] args)
	{
		 char charLiteral = 'A';
		String string = "Hello";

		System.out.println((int)charLiteral );
		for (int i = 0; i < string.length(); i++) {
			System.out.print((int)string.charAt(i) + " ");
		}
	}
}
