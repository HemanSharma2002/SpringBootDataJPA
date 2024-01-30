package com.SpringDataJpa.DataJpa.repository;

import com.SpringDataJpa.DataJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student,Long> {
}
