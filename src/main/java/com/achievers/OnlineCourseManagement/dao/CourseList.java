package com.achievers.OnlineCourseManagement.dao;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import com.achievers.OnlineCourseManagement.entity.Course;

public class CourseList {
	private static List<Course> courseList = Arrays.asList(new Course(101,"JAVA",358,36000.0f),new Course(102,"PYTHON",344,32000.0f),new Course(103,"DA",320,35000.0f) );
	
	
	public static List<Course> getCourseList(){
		return courseList;
	}
}
