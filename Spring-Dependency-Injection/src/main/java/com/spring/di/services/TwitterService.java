package com.spring.di.services;

public class TwitterService implements MessageServices{

	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter Msg Sent to "+rec+" with Message= "+msg );
		return true;
	}


}
