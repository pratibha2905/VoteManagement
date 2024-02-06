package com.poker.votemanagement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poker.votemanagement.dto.userStoriesDTO;
import com.poker.votemanagement.entity.userStories;

@Repository
public interface UserStoryRepo extends JpaRepository<userStories, Integer> {
	List<userStoriesDTO> findAllUserStories();
	public userStoriesDTO findByUsername(Integer id);
	void save(userStoriesDTO userStory);
}


