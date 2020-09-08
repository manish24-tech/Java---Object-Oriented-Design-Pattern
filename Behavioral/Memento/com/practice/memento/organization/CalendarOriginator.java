package com.practice.memento.organization;

import java.util.Date;

public class CalendarOriginator {

	private Date  date;
	private String holiday;

	public CalendarOriginator() {}
	
	public CalendarOriginator(Date date, String holiday) {
		this.date = date;
		this.holiday = holiday;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public CalendarMemento save() {
		System.out.println("CalendarOriginator.save() => store object state => "+ this.toString());
		return new CalendarMemento(date, holiday);
	}
	
	public void restore(CalendarMemento calandarMemento) {
		date = calandarMemento.getDate();
		holiday = calandarMemento.getHoliday();
		System.out.println("CalendarOriginator.restore() => restore object state => "+ this.toString());
	}

	@Override
	public String toString() {
		return "CalendarOriginator [date=" + date + ", holiday=" + holiday + "]";
	}
	
	

}
