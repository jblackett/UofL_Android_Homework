package com.jblackett.criminalintent;

import java.util.UUID;

public class Crime {
	
	private UUID mID;
	private String mTitle;
	
	public Crime(){
		//Generate unique identifier
		mID = UUID.randomUUID();
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String title) {
		mTitle = title;
	}

	public UUID getmID() {
		return mID;
	}
	
}
