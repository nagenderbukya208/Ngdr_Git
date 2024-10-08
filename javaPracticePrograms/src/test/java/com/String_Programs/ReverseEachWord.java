package com.String_Programs;

import org.testng.annotations.Test;

public class ReverseEachWord {
@Test
public void reverseEachAndEvreyWord() {
	String str="given when then";
	String[] res = str.split(" ");
	for(int i=0;i<res.length;i++) {
		for(int j=res[i].length()-1;j>=0;j--) {
			System.out.print(res[i].charAt(j));
		}
		System.out.print(" ");
	}
	}
@Test
public void reverseEachAndEvreyWord2() {
	String str="my name is rgv";
	String[] res = str.split(" ");
	for(int i=0;i<res.length;i++) {
		System.out.print(new StringBuilder(res[i]).reverse()+" ");
  }
 }
}

