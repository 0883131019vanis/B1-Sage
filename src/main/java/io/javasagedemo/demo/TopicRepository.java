package io.javasagedemo.demo;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>{

	findByName
}