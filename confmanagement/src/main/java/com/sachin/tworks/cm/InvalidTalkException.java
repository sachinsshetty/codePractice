package com.sachin.tworks.cm;

public class InvalidTalkException extends Exception {

	String msg;
	public InvalidTalkException(String string) {
		msg = string;
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println(msg); 
		super.printStackTrace();
	}
	
	
}
