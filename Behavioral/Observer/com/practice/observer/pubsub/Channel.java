package com.practice.observer.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Channel {

	private List<Observer> subscribers = new ArrayList<>();
	private String channelName;
	private String title;
	
	public Channel(String channelName, String title) {
		this.channelName = channelName;
		this.title = title;
	}
	
	public void subscribe(Observer observer) {
		subscribers.add(observer);	
	}
	
	public void unSubscribe(Observer observer) {
		subscribers.remove(observer);	
	}
	
	public void notifyToSubscriber(String publisherName) {
		subscribers.forEach(sub -> sub.update(publisherName, channelName, title));
	}
	
	public void notifyToPublisher() {
		for(Observer sib : subscribers) {
			Subscriber sv =  (Subscriber)sib;
			System.out.println("Name => "+sv.getName());
		}
	}

}
