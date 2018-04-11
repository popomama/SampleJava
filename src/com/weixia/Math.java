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

	public double Div(int a, int b)
	{
		if(b!=0)
			return (double)a/b;
		else 
			return 0.0;
	}
}
