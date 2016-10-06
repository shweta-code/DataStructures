package com.dataStructures.stack.implemetation;

import com.dataStructures.stack.LocalStackUsingArray;

public class ReverseStringUsingStack {
	
	public static void main(String[] args) {
		LocalStackUsingArray stack=new LocalStackUsingArray(10);
		String s="sd";
		if( s!= null){
			char[] charArray=s.toCharArray();
			
			for(char cs:charArray){
				stack.push(String.valueOf(cs));
			}
			
			int length= s.length();
			s="";
			for (int i= 0;i<length ;i++){
				s=s+stack.pop();
			}
			
			System.out.println(s);
		}
		
		
		
		
	}

}
