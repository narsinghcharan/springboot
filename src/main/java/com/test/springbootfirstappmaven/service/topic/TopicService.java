package com.test.springbootfirstappmaven.service.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springbootfirstappmaven.model.topic.Topic;
import com.test.springbootfirstappmaven.repository.topic.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList();
		
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public Topic getTopic(String id) {

		return null; //topicRepository.find;
	}
	
	public void updateTopic(Topic topic,String id) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

	
	List<Topic> topics = new ArrayList(Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework description"),
			new Topic("Hibernate", "Hibernate Framework", "Hibernate Framework description"),
			new Topic("WebServices", "Webservices Framework", "WebServices Description")));

	
	
	
/*	public void addTopic(Topic topic) {
		topics.add(topic);
	}
*/
}
