package com.String_Programs;

import org.testng.annotations.Test;

public class OccurrenceOrFrequencyOfString {
	@Test
	public void OccurrenceOrFrequencyOfString() {
		String str = "Nagender".toLowerCase();		
		for(int i=0; i<str.length(); i++) {
			int count=0;
			char ch1 = str.charAt(i);
			for(int j=0; j<str.length(); j++) {
				char ch2 = str.charAt(j);
				if(ch1==ch2 && i>j) {
					break;
				}
				if(ch1==ch2) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch1+" : "+ count);
			}
		}
	}
	//======================================================================================
	@Test
	public void OccurrenceOrFrequencyOfString2() {
		String s = "Nagender";	
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
		
		if(!(res.contains(s.charAt(i)+""))) {
			res=res+s.charAt(i);
			}
			}
		}
		for(int i=0;i<res.length();i++) {
			int count=0;
			for(int j=0;i<s.length();j++) {
				if(res.charAt(i)==s.charAt(j))
					count++;
			}
			System.out.println(res.charAt(i)+"====> "+count);
		}
  }
	//===================================================================
	@Test
	public void occur4() {
		String str = "india is not for begginers";
		// char[] str = s.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			// boolean found=false;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (i > j) {
						break;
					} else {
						count++;
					}
				}
			}
			if (count > 1) {
				System.out.println(str.charAt(i) + " " + count);
			}
		}
	}
	//======================================================================
	@Test
	public void occur5() {// follow this
		{
			String s = "india is not for beginners";
			for (int i = 0; i < s.length(); i++) {
				int count = 0;
				if (s.charAt(i) != ' ') {
					for (int j = 0; j < s.length(); j++) {
						if (s.charAt(i) == s.charAt(j)) {
							if (i > j) {
								break;
							} else {
								count++;
							}
						}
					}
				}

				if (count > 0) {
					System.out.println(s.charAt(i) + "  " + count);
				}
			}
		}
	 }
	}

