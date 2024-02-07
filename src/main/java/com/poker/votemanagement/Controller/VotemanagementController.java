package com.poker.votemanagement.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poker.votemanagement.dto.userStoriesDTO;

@RestController
@RequestMapping(value="/votemanagement")
public class VotemanagementController {
		
	@Autowired
	com.poker.votemanagement.Service.userStoryService userStoryService;
	
	@GetMapping(value="/votemanagement/voteStories/{getUserStory}")
	public List<userStoriesDTO> getUserStoryList(){
		return userStoryService.findAllUserStories();
	}
	
	@GetMapping(value="/votemanagement/voteStories/start/{id}")
	public userStoriesDTO getUserStory(@PathVariable("id") int id){
		return userStoryService.findUserStoryById(id);
	}
	
	@PutMapping(value="/votemanagement/voteStories/submit/{id}")
	public ResponseEntity<userStoriesDTO> updateUserStory(@PathVariable("id") int id){
		return new ResponseEntity<userStoriesDTO>(userStoryService.updatetotalVotes(id),HttpStatus.OK);
	}
	
	@GetMapping(value="/votemanagement/voteStories/totalVotes/{id}")
	public Map<String, String> getTotalVotes(@PathVariable("id") int id){
		Map<String,String> voted=new HashMap<String, String>();
		userStoriesDTO userStory=userStoryService.findUserStoryById(id);
		voted.put("name", userStory.getName());
		voted.put("TotalVotes", Integer.toString(userStory.getTotalVotes()));
		return voted;
	}
	
	@GetMapping(value="/votemanagement/voteStories/stop/{id}")
	public ResponseEntity<userStoriesDTO> getUSerStoryStatus(@PathVariable("id") int id){
		return new ResponseEntity<userStoriesDTO>(userStoryService.getUserStoryStatus(id),HttpStatus.OK);
	}
	
	
}
