package com.SpringDataJpa.DataJpa.repository;

import com.SpringDataJpa.DataJpa.entity.Course;
import com.SpringDataJpa.DataJpa.entity.CourseMaterial;
import com.SpringDataJpa.DataJpa.repository.CourseMaterialRepository;
import com.SpringDataJpa.DataJpa.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseMaterialRepositoryTest {
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;
    @Test
    public void addCourseMaterial(){
        Course course= Course.builder()
                .title(".net")
                .credit(20).build();
        CourseMaterial courseMaterial= CourseMaterial.builder()
                .url("www.dsa.com")
                .course(course)
                .build();
        courseMaterialRepository.save(courseMaterial);
    }
    @Test
    public void printAllCourseMaterialList(){
        System.out.println(courseMaterialRepository.findAll());
    }
}
