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
	
	public userStoriesDTO findUserStoryById(int id){
		userStoriesDTO userStory=userStoryrepo.findByUsername(id);
		return userStory;
	}
	
}
