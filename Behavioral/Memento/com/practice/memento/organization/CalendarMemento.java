package com.practice.memento.organization;

import java.util.Date;

public class CalendarMemento {
	
	private Date  date;
	private String holiday;

	public CalendarMemento(Date date, String holiday) {
		this.date = date;
		this.holiday = holiday;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHoliday() {
		return holiday;
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
}
