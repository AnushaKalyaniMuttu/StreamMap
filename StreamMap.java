package com.biconsumer;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main (String [] args) {
		Map<String,List<String>> studentDatabse=StudentDatabase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		studentDatabse.entrySet().forEach(System.out::println);
	}
	
}
