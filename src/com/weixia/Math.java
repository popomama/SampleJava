package com.weixia;

import com.weixia.service.MessageService;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageService ms = new MessageService();
		
		System.out.println(ms.getMessage());
		
	}
	
	public int Add(int a , int b)
	{
		return a+b;
	}
	
	public int Sub(int a, int b)
	{
		return a-b;
	}
	
	public int Div(int a, int b)
	{
		return a/b;
	}

}
