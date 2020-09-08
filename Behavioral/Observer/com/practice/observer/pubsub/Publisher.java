package com.practice.observer.pubsub;

public class Publisher {

	private String name;
	private Channel channel;
	
	public Publisher(String name, Channel channel) {
		this.name = name;
		this.channel = channel;
	}
	
	public void upload() {
		System.out.println("Publisher.upload() => Sending notification to all subscriber.... about content published by publisher");
		channel.notifyToSubscriber(name);
	}
	
	public void receiveNotification(Channel channel) {
		System.out.println("Publisher.receiveNotification() => Sending notification to publisher.... about subscriber as name");
		channel.notifyToPublisher();
	}

}
