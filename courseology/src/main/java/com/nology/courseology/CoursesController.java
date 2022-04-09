package com.nology.courseology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CoursesController {

  @Autowired CoursesRepository repository;

  private List<Course> courses = new ArrayList<>();

  @PostMapping("/courses")
  public ResponseEntity<String> createCourse(@RequestBody Course course) {
    repository.save(course);
    return ResponseEntity.status(HttpStatus.CREATED).body("Course created");
  }

  //Want to return all courses
  @GetMapping("/courses")
  public ResponseEntity<List<Course>> getCourses() {
    return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
  }

  @GetMapping("/course/{id}")
  public ResponseEntity<Course> getCourseById(@PathVariable String id) {
    return ResponseEntity.status(HttpStatus.OK).body(repository.findById(Integer.parseInt(id)));
  }

  @DeleteMapping("course/{id}")
  @Transactional
  public ResponseEntity<String> deleteCourseById(@PathVariable String id) {
    repository.deleteById(Integer.parseInt(id));
    return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Deleted");
  }
}
