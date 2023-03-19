package com.test.wordreverser;

import java.util.Arrays;
import java.util.List;

public class WordReverser {

	public static void main(String[] args) {		
		wordRevere("Hello dad How is mom");
	}

	static void wordRevere(String input) {
		String[] strArr = input.split(" ");
		StringBuffer sb1 = new StringBuffer();
		List<String> strList =  Arrays.asList(strArr);
		strList.stream().forEach(a -> {
			StringBuffer sb = new StringBuffer(a);
			//System.out.println("arr item.."+ sb.reverse());
			String revStr = sb.reverse().toString();
			sb1.append((a.equals(revStr) ? "$"+a+"$" : revStr)+" ");
		});
		System.out.println(sb1);
	}
}
