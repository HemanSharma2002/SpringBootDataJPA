package com.SpringDataJpa.DataJpa.repository;

import com.SpringDataJpa.DataJpa.entity.Course;
import com.SpringDataJpa.DataJpa.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    private TeacherRepository teacherRepository;
    @Test
    public void saveTeacher(){
        Course courseDBMS= Course.builder()
                .title("Python")
                .credit(10).build();
        Course courseJava= Course.builder()
                .title("C++")
                .credit(10).build();
        Teacher teacher= Teacher.builder()
                .firstName("Rajeev ")
                .lastName("Sharma")
                .course(List.of(courseDBMS,courseJava)).build();
        teacherRepository.save(teacher);
    }
}