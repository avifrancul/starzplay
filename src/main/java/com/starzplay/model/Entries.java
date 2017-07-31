package com.starzplay.model;

import java.util.List;

public class Entries {

	private String id;
	private String guid;
	private int updated;
	private String title;
	private String description;
	private String peg$contentClassification;
	private List<Media> media;
	
	public Entries(String id, String guid, int updated, String title, String description,
			String peg$contentClassification, List<Media> media) {
		super();
		this.id = id;
		this.guid = guid;
		this.updated = updated;
		this.title = title;
		this.description = description;
		this.peg$contentClassification = peg$contentClassification;
		this.media = media;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public int getUpdated() {
		return updated;
	}

	public void setUpdated(int updated) {
		this.updated = updated;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPeg$contentClassification() {
		return peg$contentClassification;
	}

	public void setPeg$contentClassification(String peg$contentClassification) {
		this.peg$contentClassification = peg$contentClassification;
	}

	public List<Media> getMedia() {
		return media;
	}

	public void setMedia(List<Media> media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Entries [id=" + id + ", guid=" + guid + ", updated=" + updated + ", title=" + title + ", description="
				+ description + ", peg$contentClassification=" + peg$contentClassification + ", media=" + media + "]";
	}
	
	
	
	
}
