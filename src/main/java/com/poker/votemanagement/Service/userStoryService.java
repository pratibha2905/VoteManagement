package com.poker.votemanagement.Service;

import java.util.List;
import java.util.Map;

import com.poker.votemanagement.dto.userStoriesDTO;

public interface userStoryService {

	public List<userStoriesDTO> findAllUserStories();
	//public userStories getUserStoryStatus(int id);

	public userStoriesDTO findUserStoryById(int id);
	
	
}
