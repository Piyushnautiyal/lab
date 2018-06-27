package com.spring.di.services;

public class EmailServices implements MessageServices{

	public boolean sendMessage(String msg, String rec) {
			
		System.out.println("Email Sent to "+rec+" with Message= "+msg );
		return true;
	}

}
