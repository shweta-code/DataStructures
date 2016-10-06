package com.dataStructures.stack.implemetation;

import java.util.Arrays;
import java.util.Stack;

import com.dataStructures.stack.LocalStackUsingArray;

public class InFixFixExpressionToPreFixUsingStack {
	
	
	//23*45*1-
	public static void main(String[] args) {
		
		String postFixExpression = "23*45*1-";
		char[] charArray=postFixExpression.toCharArray();
		Stack<Integer> stackArray = new Stack<Integer>();
		char[] expressions = {'*','-','+','/'}; 
		
		for(char c:charArray){
			
			if( Arrays.asList(expressions).contains(c) ){
				perform (stackArray, c);
			} else {
				stackArray.push(Integer.valueOf(c))
			}
		}
		
	}

	private static void perform(Stack<Integer> stackArray, char opeartor) {

		Integer operand1=	stackArray.pop();
		Integer operand2=	stackArray.pop();
		Integer result;
		if(opeartor == '*'){
			result=operand1*operand2;
		} else if(opeartor == '-'){
			result=operand1-operand2;
		} else if(opeartor == '+'){
			result=operand1+operand2;
		} else {
			result=operand1/operand2;
		}
		
		stackArray.push(result);
	}

}
