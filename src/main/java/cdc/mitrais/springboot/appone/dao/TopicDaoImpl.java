package cdc.mitrais.springboot.appone.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import cdc.mitrais.springboot.appone.model.Topic;

@Repository
public class TopicDaoImpl implements TopicDao{

	@Override
	public List<Topic> getAllTopics() {
		
		List<Topic> topicList = new ArrayList<Topic>();
		topicList.add(new Topic(101, "Spring", "Spring Framework Description"));
		topicList.add(new Topic(102, "J2EE", "J2EE Framework Description"));
		topicList.add(new Topic(103, "Apache Camel", "Apache Camel Framework Description"));
		topicList.add(new Topic(104, "Kafka", "Kafka Framework Description"));
		topicList.add(new Topic(105, "JMS", "JMS Framework Description"));
		
		return topicList;
	}

}
