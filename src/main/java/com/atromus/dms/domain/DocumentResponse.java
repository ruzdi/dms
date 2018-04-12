package com.atromus.dms.domain;

import java.util.List;

public class DocumentResponse {
	
	private String id;
	private String title;
	private String content; 
	private int accessLavel;
	private List<String> collaborator; 
	private List<String> viewers;
	
	public DocumentResponse() {
		super();
	}
	
	public DocumentResponse(String id, String title, String content) {
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
	public List getCollaborator() {
		return collaborator;
	}
	public void setCollaborator(List collaborator) {
		this.collaborator = collaborator;
	}
	public List getViewers() {
		return viewers;
	}
	public void setViewers(List viewers) {
		this.viewers = viewers;
	}
	
	
	
	//for future development
//	private User[] collaborator; 
//	private User[] viewers; 
	
	
	
	
	
	
	
}
