package com.cource_management_app.cource_app.services;

import com.course_management_app.course_app.dao.Course;

import java.util.List;

public interface CourseServiceImpl {
    List<Course> getCourses();

    Course getCourse(long id);

    Course addCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(long courseID);
}
