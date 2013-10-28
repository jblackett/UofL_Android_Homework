package com.jblackett.criminalintent;

import java.sql.Date;
import java.util.UUID;

public class Crime {
	
	private UUID mID;
	private String mTitle;
	private Date mDate;
	private boolean mSolved;
	
		
	public Crime(){
		//Generate unique identifier
		mID = UUID.randomUUID();
		mDate = new Date(0);
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}

	public UUID getID() {
		return mID;
	}

	public Date getDate() {
		return mDate;
	}

	public void setDate(Date date) {
		date = mDate;
	}

	public boolean isSolved() {
		return mSolved;
	}

	public void setSolved(boolean solved) {
		solved = mSolved;
	}
	
	
	
	
}
