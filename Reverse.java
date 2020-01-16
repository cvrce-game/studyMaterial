package com.demo;

import java.util.Scanner;

public class Reverse {
//	public static void main(String[] args) {
////		StringBuilder sb = new StringBuilder("geeks quiz practice code");
////		System.out.println(sb.reverse());
//
//		String s[] = "i like this program very much".split(" ");
//		String ans = "";
//		for (int i = s.length - 1; i >= 0; i--) {
//			ans += s[i] + " ";
//		}
//		System.out.println("Reversed String:");
//		System.out.println(ans.substring(0, ans.length() - 1));
//	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String input=sc.next();
		System.out.println("Original string is\n"+input);
		String output=sortString(input);
		System.out.println("After Sort string\n"+output);
	}
	public static String sortString(String input){
		char[] charArray=new char[input.length()];
		input=input.toLowerCase();
		int index=0;
		for(int i='a';i<='z';i++){
			for(int j=0;j<input.length();j++){
				if(input.charAt(j)==i)
					charArray[index++]=(char)i;
			}
		}
		return new String(charArray);
	}
}
