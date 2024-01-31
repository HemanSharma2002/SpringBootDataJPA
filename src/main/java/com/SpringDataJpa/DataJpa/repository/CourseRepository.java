package com.SpringDataJpa.DataJpa.repository;

import com.SpringDataJpa.DataJpa.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
