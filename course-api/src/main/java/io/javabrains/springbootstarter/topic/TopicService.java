package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics= new ArrayList<>(Arrays.asList(
				new Topic("Spring","spring Framework","Spring Framework Description"),
				new Topic("java","core JAVA","core JAVA Description"),
				new Topic("java script","java script","java script Description"),
				new Topic("python","libraries","python Description")
				));

	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(String id, Topic topic) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
