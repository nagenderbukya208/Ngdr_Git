package BasicJavaTekPYRAMID;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class ScreeningPrograms {
@Test
public void sampleTest() {
	String s1="$9#7A";
	String num=s1.replaceAll("[^0-9]", "");
	String ch=s1.replaceAll("[^A-Z]", "");
	int sum=0;
	for(int i=0;i<num.length();i++) {
		sum+=Character.getNumericValue(num.charAt(i));
	}
	System.out.println(ch+sum);
}
@Test
public void sample2() {
	String s1="$#28!&33AB#C";
	String[] num=s1.split("[^0-9]");
	String[] ch=s1.split("[^A-Z]");
	for(int i=num.length-1;i>=0;i--) {
		if(num[i] !="") {
			System.out.print(num[i]+" ");
		}
	}
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!="")
			System.out.print(ch[i]+" ");
	}
}
@Test
public void sample3() {
	String s1="i Love Java";
	String s2=s1.replaceAll(" ", "");
	int l=s2.length()-1;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)==' ') {
			System.out.print(s1.charAt(i));
		}else {
			System.out.print(s2.charAt(l--));
		}
	}
}
	@Test
	public void sample4() {
		String s1="a3b2c1";
		for(int i=0;i<s1.length()-1;i+=2) {
			int n=Character.getNumericValue(s1.charAt(i+1));
			for(int j=1;j<=n;j++) {
				System.out.print(s1.charAt(i));
			}
		}
 }
		// Or
		@Test
		public void sample5() {
			String s1="a3b2c1";
			for(int i=0;i<s1.length()-1;i+=2) {
		int n=Character.getNumericValue(s1.charAt(i+1));
		String s2=""+s1.charAt(i);
		System.out.print(s2.repeat(n));
		}
	}
		@Test
		public void sample6() {
	  String s="aabbbcc";
	  Map<Character, Integer> map=new LinkedHashMap();
	  for(char c:s.toCharArray())
	  {
		  map.put(c, map.getOrDefault(c,0)-1);
	  }
	  for(Map.Entry<Character, Integer> occur:map.entrySet()) {
		  System.out.println(occur.getKey()+""+occur.getValue());
	  }
	}
		//Or
		@Test
		public void sample7() {
	  String s="acc";
	  int c=1;
	  for(int i=0;i<s.length()-1;i++) {
		  if(s.charAt(i)==s.charAt(i+1)) {
			  c++;
		  }else
		  {
			  System.out.print(s.charAt(i)+""+c);
			  c=1;
		  }
		  System.out.println();
	  }
	  System.out.println(s.charAt(s.length()-1)+""+c);
		}
}




