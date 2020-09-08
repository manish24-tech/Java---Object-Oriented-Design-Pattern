package com.practice.observer.main;

import com.practice.observer.pubsub.Channel;
import com.practice.observer.pubsub.Observer;
import com.practice.observer.pubsub.Publisher;
import com.practice.observer.pubsub.Subscriber;

/**
 * observer is pub-sub model where subscriber are observing any new event or state change from publisher to get update and this way they can track the event/objects
 * 
 * @author Manish Luste
 *
 */
public class ObserverApplication {

	public static void main(String[] args) {
		// 1. channel owner creates a channel and upload the content 
		Channel channel = new Channel("Java Techie", "Java Design Pattern!");
		
		// 2. list of subscriber going to subscribe/unsubscribe the channel 
		Observer subscriber1 = new Subscriber("Manish");
		Observer subscriber2 = new Subscriber("Nehal");
		Observer subscriber3 = new Subscriber("Deepak");
		Observer subscriber4 = new Subscriber("Nisha");
		Observer subscriber5 = new Subscriber("Kamal");
		
		// 3.1 subscribers is subscribing the channel
		channel.subscribe(subscriber1);
		channel.subscribe(subscriber2); 
		channel.subscribe(subscriber3);
		channel.subscribe(subscriber4);
		channel.subscribe(subscriber5);
		
		// 3.2 subscribers is un-subscribing the channel
		channel.unSubscribe(subscriber4);
		
		// 4. publisher going to upload the content in channel and notify to their subscriber
		Publisher publisher = new Publisher("Begineer Champ", channel);
		publisher.receiveNotification(channel); // send the subscriber list to publisher for content
		System.out.println("-----------------------");
		publisher.upload(); // send content notification to subscribers
		
	}

}
