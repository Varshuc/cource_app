package com.cource_management_app.cource_app.Dao;

import com.course_management_app.course_app.dao.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course , Long> {
}


