package com.cource_management_app.cource_app.services;

import com.course_management_app.course_app.dao.Course;

import java.util.List;
import java.util.Optional;

public interface CourseDao {
    List<Course> findAll();

    Optional<Course> findById(long id);

    void save(Course course);

    void delete(Course course);
}
