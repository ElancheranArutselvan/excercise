package com.elan.exercise.Repository;

import com.elan.exercise.Entity.ManyToMany.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    List<Course> getByFeesLessThan(double fees);
}