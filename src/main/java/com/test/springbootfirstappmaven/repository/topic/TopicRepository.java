package com.test.springbootfirstappmaven.repository.topic;

import org.springframework.data.repository.CrudRepository;

import com.test.springbootfirstappmaven.model.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> 
{
	//getAllTopic()
	//getTopic(String id)
	//updateTopic(Topic topic)
	//deleteTopic(String id)
	
}
