package com.simplilearn.workshop.model;

public class Welcome {
	private String messages;
	
	public Welcome(String messages) {
		super();
		this.messages = messages;
	}
	public String getMessage(){
		return messages;
	}
	public void setMessage(String message){
		this.messages= message;
	}

}
