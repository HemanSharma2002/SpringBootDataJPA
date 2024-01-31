package com.SpringDataJpa.DataJpa.repository;

import com.SpringDataJpa.DataJpa.entity.Course;
import com.SpringDataJpa.DataJpa.entity.CourseMaterial;
import com.SpringDataJpa.DataJpa.entity.Student;
import com.SpringDataJpa.DataJpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;

import java.awt.print.Pageable;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;
    @Test
    public void getAllCourses(){
        System.out.println(courseRepository.findAll());
    }
    @Test
    public void saveACourse(){
        Course course=Course.builder().title("Computer Networks")
                .credit(10)
                .teacher(Teacher.builder().firstName("Heman").lastName("Sharma").build())
                .build();
        courseRepository.save(course);
    }
//    @Test
//    public void findAllPAgination(){
//        Pageable firstPageWith3Records= (Pageable) PageRequest.of(0,3);
//        Pageable secondPageWith3Records= (Pageable) PageRequest.of(1,2);
//        List<Course> courses=courseRepository.findAll()(firstPageWith3Records)
//
//    }
    @Test
    public void saveCourseWithStudent(){
        Teacher teacher= Teacher.builder().firstName("Rahul").lastName("Verma").build();
        Student student= Student.builder().firstName("Abhishek").lastName("Singh")
                .emailId("ak@gmail.com").build();
        Course course= Course.builder()
                .title("AI")
                .credit(20)
                .teacher(teacher).build();
        course.addStudents(student);
        courseRepository.save(course);
    }
}