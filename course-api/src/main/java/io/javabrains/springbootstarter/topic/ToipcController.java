package io.javabrains.springbootstarter.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class ToipcController {
	@Autowired
	private TopicService topicservice;
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicservice.getAllTopics();
		
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}
	
	
//POST method example
//	@RequestMapping(method=RequestMethod.POST, value="/topics")
//	public void addTopic(@RequestBody Topic topic)
//	{
//		topicservice.addTopic(topic);
//		
//	}
	
	
	//UPDATE or PUT example
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		topicservice.updateTopic(id,topic);
	}
	
	//DELETE example
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		 topicservice.deleteTopic(id,topic);
	}
}
