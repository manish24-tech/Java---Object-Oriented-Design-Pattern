package com.practice.observer.pubsub;

public class Subscriber implements Observer {

	private String name;
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(String publisherName, String channelName, String title) {
		System.out.println("Hey.."+ name+",\n New content from "+channelName+" of publisher "+publisherName+" is Avialable Now! and its regarding =>"+title+"\n");
		
	}
		
}
