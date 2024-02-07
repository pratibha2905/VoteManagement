package com.poker.votemanagement.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.poker.votemanagement.dto.userStoriesDTO;
import com.poker.votemanagement.entity.userStories;
import com.poker.votemanagement.repo.UserStoryRepo;

public class userStoryServiceImpl implements userStoryService{
	
	@Autowired
	UserStoryRepo userStoryrepo;
	
	@Autowired
	userStoriesDTO userStoriesDTO;
	
	public List<userStoriesDTO> findAllUserStories(){
		List<userStoriesDTO> userstoriesList = userStoryrepo.findAllUserStories();
		return userstoriesList;
		
	}
	

	@Override
	public com.poker.votemanagement.dto.userStoriesDTO findUserStoryById(int id) {
		// TODO Auto-generated method stub
		userStoriesDTO userStory=userStoryrepo.findByUsername(id);
		if(userStory.getVote()==false)
			userStory.setVote(true);
		userStoryrepo.save(userStory);
		return userStory;
	}


	@Override
	public com.poker.votemanagement.dto.userStoriesDTO updatetotalVotes(int id) {
		// TODO Auto-generated method stub
		userStoriesDTO userStory=userStoryrepo.findByUsername(id);
		if(userStory.getVote()==true) {
			int totalVotes=userStory.getTotalVotes();
			userStory.setTotalVotes(totalVotes+1);
		}
		userStoryrepo.save(userStory);
		return userStory;
	}



	@Override
	public com.poker.votemanagement.dto.userStoriesDTO getUserStoryStatus(int id) {
		// TODO Auto-generated method stub
		userStoriesDTO userStory=userStoryrepo.findByUsername(id);
		if(userStory.getVote()==true)
			userStory.setVote(false);
		userStoryrepo.save(userStory);
		return userStory;
	}
	
	
	
}
