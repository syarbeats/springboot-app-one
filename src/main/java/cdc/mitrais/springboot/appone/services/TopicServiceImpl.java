package cdc.mitrais.springboot.appone.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdc.mitrais.springboot.appone.dao.TopicDao;
import cdc.mitrais.springboot.appone.model.Topic;

@Service
public class TopicServiceImpl implements TopicService{

	@Autowired
	private TopicDao topicDao;
	
	@Override
	public List<Topic> getAllTopics() {
		
		return topicDao.getAllTopics();
	}

}
