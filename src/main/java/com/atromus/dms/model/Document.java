package com.atromus.dms.model;

import java.util.List;

public class Document {
	
	private String id;
	private String title;
	private String content; 
	private int accessLavel;
	private List<User> collaborator; 
	private List<User> viewers; 
	
	public Document() {
		super();
	}
	
	public Document(String id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAccessLavel() {
		return accessLavel;
	}
	public void setAccessLavel(int accessLavel) {
		this.accessLavel = accessLavel;
	}

	public List<User> getCollaborator() {
		return collaborator;
	}

	public void setCollaborator(List<User> collaborator) {
		this.collaborator = collaborator;
	}

	public List<User> getViewers() {
		return viewers;
	}

	public void setViewers(List<User> viewers) {
		this.viewers = viewers;
	}
	
	
	
}
