package com.in28minutes.springboot.learnspringboot.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.springboot.learnspringboot.course.Course;

@RestController
public class CourseController {
    public static List<Course> courses=new ArrayList<Course>();
    public static int id;

    static{
        courses.add(new Course(++id, "Learn Spring Boot", "Ranga Karanam"));
        courses.add(new Course(++id, "Learn Hibernate", "Ranga Karanam"));
        courses.add(new Course(++id, "Learn AWS", "Ranga Karanam"));
        courses.add(new Course(++id, "Learn GCP", "Ranga Karanam"));
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return courses;
    }
}
