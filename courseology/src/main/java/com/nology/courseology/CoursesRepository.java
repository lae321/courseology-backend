package com.nology.courseology;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<Course, String> {
  Course findById(int id);
  String deleteById(int id);
}
