package com.cource_management_app.cource_app.services;

import com.course_management_app.course_app.dao.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public final class CourseServiceImlp implements CourseServiceImpl {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long id) {
        Optional<Course> courseOptionalObject = courseDao.findById(id);
        if (courseOptionalObject.isPresent())
            return courseOptionalObject.get();
        else
            return null;
    }

    @Override
    public Course addCourse(Course course) {

        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long courseID) {
        Course course = courseDao.findById(courseID).get();
        courseDao.delete(course);
    }
}
