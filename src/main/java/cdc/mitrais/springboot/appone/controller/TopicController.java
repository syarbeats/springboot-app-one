package cdc.mitrais.springboot.appone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cdc.mitrais.springboot.appone.model.Topic;
import cdc.mitrais.springboot.appone.services.TopicService;

@RestController()
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
		return topicService.getAllTopics();
	}
}
