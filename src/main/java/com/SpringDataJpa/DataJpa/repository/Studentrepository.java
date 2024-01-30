package com.SpringDataJpa.DataJpa.repository;

import com.SpringDataJpa.DataJpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface Studentrepository extends JpaRepository<Student,Long> {
    List<Student> findByFirstNameContaining(String name);
    List<Student> findByGuardianName(String name);
    @Modifying
    @Transactional
    @Query(value = "update tbl_Student set last_name = ?1 where email_address = ?2",
    nativeQuery = true)
    int updateLastNameByEmail(String lastName,String email);
}
