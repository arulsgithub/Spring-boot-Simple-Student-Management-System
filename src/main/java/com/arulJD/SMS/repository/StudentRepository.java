package com.arulJD.SMS.repository;

import com.arulJD.SMS.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
