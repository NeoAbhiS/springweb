package com.springboot.springweb.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springweb.courses.bean.Course;

@RestController
public class CourseController {
	
	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return Arrays.asList(new Course(1, "SpringBoot", "java"), 
				new Course(2, "panda", "python"),
				new Course(3, "Angular", "javaScript"));
	}
	
	// http://localhost:8080/course/1
	@GetMapping("/course/1")
	public Course getCourse()
	{
		return new Course(1, "SpringBoot", "java");
	}
	
	

}
