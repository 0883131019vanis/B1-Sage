package io.javasagedemo.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javasagedemo.demo.Language;



@RestController
public class LanguageController {
	

	@RequestMapping("/lng")
	public List<Language> getLanguages() {
		return Arrays.asList(
				 new Language("japanese", 100),
				 new Language("Chinese", 200));
				
				
	}
	

}
