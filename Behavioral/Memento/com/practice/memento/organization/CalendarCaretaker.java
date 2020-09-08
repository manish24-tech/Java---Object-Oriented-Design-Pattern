package com.practice.memento.organization;

import java.util.ArrayList;
import java.util.List;

public class CalendarCaretaker {

	List<CalendarMemento> mementos = new ArrayList<CalendarMemento>();
	
	public void addMemento(CalendarMemento calendarMemento) {
		mementos.add(calendarMemento);
	}

	public CalendarMemento getMemento() {
		return mementos.get(mementos.size() - 2);
	}
}
