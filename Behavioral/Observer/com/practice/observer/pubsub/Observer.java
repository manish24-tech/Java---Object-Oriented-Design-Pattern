package com.practice.observer.pubsub;

public interface Observer {
	
	void update(String publisherName, String channelName, String title);
}
