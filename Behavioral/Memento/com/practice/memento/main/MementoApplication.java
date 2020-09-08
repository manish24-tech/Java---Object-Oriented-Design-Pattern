package com.practice.memento.main;

import java.util.Date;

import com.practice.memento.organization.CalendarCaretaker;
import com.practice.memento.organization.CalendarOriginator;

/**
 * Memento create a copy of original object state in special object to promote redo/undo operation for getting previous state of an object.
 * It will clone the state of original object without violating encapsulation or implementation of an original object
 * The Memento design pattern defines three distinct roles:
    Originator - original object that write its state for save & restore into memento.
    Memento -  handler class that contain original object's field only without implementation and helper method to get those field as state
    Caretaker - container class that store list of memento and restore previously store memento of original object  
    
 * Ex. organization have leave calendar. sometimes it might contain date mismatch while data entry. so we can restore previous state of entry of calendar using memento 
 * At the end memento is used to hold the previous state of an object from actual object without  violating implementation for performing redo operation
 *  
 * @author Manish Luste
 *
 */
public class MementoApplication {

	public static void main(String[] args) {
		
		CalendarCaretaker caretaker = new CalendarCaretaker();
		
		CalendarOriginator originator = new CalendarOriginator();
		originator.setDate(new Date());
		originator.setHoliday("HolidayX");
		caretaker.addMemento(originator.save());
		
		originator.setDate(new Date());
		originator.setHoliday("HolidayY");
		caretaker.addMemento(originator.save());
		
		originator.setDate(new Date());
		originator.setHoliday("HolidayP");
		caretaker.addMemento(originator.save());
		
		originator.setDate(new Date());
		originator.setHoliday("Holidayq");
		caretaker.addMemento(originator.save());
		
		originator.setDate(new Date());
		originator.setHoliday("Holidayr");
		caretaker.addMemento(originator.save());
		
		originator.restore(caretaker.getMemento());
		
		
	}

}
