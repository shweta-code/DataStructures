package com.dataStructures.stack;

import java.util.Iterator;

//LocalStack will have 4 functions-- push pop empty top
public class LocalStackUsingArray{
	
	private String[] array;
	private int top;
	//private final static int DEFAULT_SIZE=10;
	
	
	public LocalStackUsingArray(int size){
		array =new String[size];
		top = -1;
	}
	
	public void push(String element){
		try{
		array[++top]=element;
		}catch(IndexOutOfBoundsException e){
			System.out.println("Stack Overflow");
		}
	}
	
	public String pop(){
		try{
		return array[top--];
		}catch(IndexOutOfBoundsException e){
			System.out.println("Stack Overflow");
			top = -1;
			return null;
		}
	}
	
	public boolean isEmpty(){
		return top <= -1;
	}
	
	public String top(){
		return array[top];
	}

	/*@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}*/
	

}
