package com.poker.votemanagement.dto;

import jakarta.persistence.Column;

public class userStoriesDTO {
	private int id;
	
	private String status;
	
	private String name;
	
	private int totalVotes;
	
	private Boolean vote=false;
	

	public Boolean getVote() {
		return vote;
	}

	public void setVote(Boolean vote) {
		this.vote = vote;
	}

	public userStoriesDTO(int id, String status, String name, int totalVotes, Boolean vote) {
		super();
		this.id = id;
		this.status = status;
		this.name = name;
		this.totalVotes=totalVotes;
		this.vote=vote;
	}

	public int getTotalVotes() {
		return totalVotes;
	}

	public void setTotalVotes(int totalVotes) {
		this.totalVotes = totalVotes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	
}
