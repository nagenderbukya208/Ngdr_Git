package com.String_Programs;

public class SmallPali {
public static void main(String[] args) {
	String s= "mom bob anna malayalam";
	String[] words=s.split(" ");
	String maxPalindrom=words[0];
	for(String s1:words) {
		String word=s1;
		String rev = new StringBuffer(s).reverse().toString();
		if(word.equals(rev)&&rev.length()<maxPalindrom.length()) {
			maxPalindrom=rev;
		}
		System.out.println(rev);
	}
}
}
