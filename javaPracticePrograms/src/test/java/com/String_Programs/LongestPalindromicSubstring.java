package com.String_Programs;

import org.testng.annotations.Test;
public class LongestPalindromicSubstring {
	@Test
	public void findLongestPalindromeSubStringinGivenString() {
		String s= "mom bob anna malayalam";
		String[] words=s.split(" ");
		String maxPalindrom="";
		for(String s1:words) {
			String word=s1;
			String rev = new StringBuffer(s1).reverse().toString();
			if(word.equals(rev)&&rev.length()>maxPalindrom.length()) {
				maxPalindrom=rev;
			}
		}
		System.out.println(maxPalindrom);
	}
}
