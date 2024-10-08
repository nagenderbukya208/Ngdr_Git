package com.String_Programs;

import java.util.Iterator;

import org.testng.annotations.Test;

public class SwapFirst_LastWordString {
	@Test
	public void swapFirstAndLastWordInString() {
		String str = "post get put patch delete";
		String[] res = str.split(" ");
		String temp = res[0];
		res[0] = res[res.length - 1];
		res[res.length - 1] = temp;
		for (String string : res) {
			System.out.print(string + " ");
		}
	}
	@Test
	public void swapFirstAndLastWordInString2(){
		String str="Bukya Nagender";
		StringBuilder rep = new StringBuilder(str.replace(" ", "")).reverse();
		for (int i = 0,j=0; i < str.length(); i++) {
			if(str.charAt(i)==' ')
			{
				System.out.print(" ");
			}
			else {
				System.out.print(rep.charAt(j++));
			}
		}
	}
}
