package com.poker.votemanagement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class userStories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "name")
	private String name;
	
	@Column(name ="totalVotes")
	private int totalVotes;
	
	@Column(name="vote")
	private Boolean vote=false;
	

	public Boolean getVote() {
		return vote;
	}

	public void setVote(Boolean vote) {
		this.vote = vote;
	}
	public userStories(int id, String status, String name, int totalVotes) {
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

	public userStories() {}
	
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
