package com.SpringDataJpa.DataJpa;

import com.SpringDataJpa.DataJpa.entity.Guardian;
import com.SpringDataJpa.DataJpa.entity.Student;
import com.SpringDataJpa.DataJpa.repository.Studentrepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class StudentRepositoryTest {


    @Autowired
    private Studentrepository studentrepository;
    @Test
    public void saveStudent(){
        Student student=Student.builder().firstName("Rahul")
                .emailId("Rahul@gmail.com")
                .lastName("Sharma")
//                .guardianName("Rajeev")
//                .guardianEmail("raj@gmail.com")
//                .guardianMobile("1234567890")
                .build();
        studentrepository.save(student);
    }
    @Test
    public void saveStudentWithGuardian(){
        Student student1=Student.builder()
                .firstName("Ketan")
                .lastName("Sharma")
                .emailId("kc@gmail.com")
                .guardian(new Guardian("Rajeev","rj@gmail.com","1234567890")).build();
        Student student2=Student.builder()
                .firstName("Raju")
                .lastName("Verma")
                .emailId("rj@gmail.com")
                .guardian(new Guardian("Bheem","bheem@gmail.com","1234567891")).build();
        studentrepository.save(student1);
        studentrepository.save(student2);
    }
    @Test
    public void printAllStudents(){
        System.out.println(studentrepository.findAll());
    }
    @Test
    public void printListOfStudentWithFirstNameStartingWith(){
        System.out.println(studentrepository.findByFirstNameContaining("a"));
    }
    @Test
    public void printListOfStudentWithGuardianName(){
        System.out.println(studentrepository.findByGuardianName("Rajeev"));
    }
    @Test
    public void updateLastNameByEmail(){
        studentrepository.updateLastNameByEmail("Sharma","rj@gmail.com");
    }
}
