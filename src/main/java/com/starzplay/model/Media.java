package com.starzplay.model;

import java.util.List;

public class Media {

	private String id;
	private String title;
	private String guid;
	private String ownerId;
	private long availableDate;
	private long expirationDate;
	private String availabilityState;
	
	public Media(String id, String title, String guid, String ownerId, long availableDate, long expirationDate,
			String availabilityState) {
		super();
		this.id = id;
		this.title = title;
		this.guid = guid;
		this.ownerId = ownerId;
		this.availableDate = availableDate;
		this.expirationDate = expirationDate;
		this.availabilityState = availabilityState;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public long getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(long availableDate) {
		this.availableDate = availableDate;
	}

	public long getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(long expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getAvailabilityState() {
		return availabilityState;
	}

	public void setAvailabilityState(String availabilityState) {
		this.availabilityState = availabilityState;
	}

	
	@Override
	public String toString() {
		return "Media [id=" + id + ", title=" + title + ", guid=" + guid + ", ownerId=" + ownerId + ", availableDate="
				+ availableDate + ", expirationDate=" + expirationDate + ", availabilityState=" + availabilityState
				+ "]";
	}
	
	
	
	
	
}
