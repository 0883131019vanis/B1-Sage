package io.javasagedemo.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	
//	findByTopic

	  public List<Course>  findByTopicId(String topicId);//  camelcase
	  
	  

}
