package com.rest.Student.Repository;

import org.springframework.stereotype.Repository;
import com.rest.Student.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
