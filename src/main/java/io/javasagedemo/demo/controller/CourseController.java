package io.javasagedemo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javasagedemo.demo.Course;
import io.javasagedemo.demo.Topic;
import io.javasagedemo.demo.service.CourseService;
import io.javasagedemo.demo.service.TopicService;



@RestController
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllTheCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	@RequestMapping("/topics/{id}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}

	
	//REq mapping -> to map
	//specify method, bcoz get is default
	//value -
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String  topicId) {//pick instance from req body 
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);   // calling service method for business logic 
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId, @PathVariable String courseId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		 courseService.deleteCourse(courseId);
	}
	
	
	
}

//get put post delete patch 
//The @RequestMapping maps only to Get method by default. 
//To map to other HTTP methods, you'll have to specify it in annotation

