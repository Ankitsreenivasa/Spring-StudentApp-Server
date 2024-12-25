package org.manh.student.Repository;

import org.manh.student.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentsByAgeGreaterThan(Integer ageIsGreaterThan);

    List<Student> findStudentsByDepartment(String department);

    List<Student> findByDepartmentAndSection(String department, String section);

    List<Student> findStudentsByDepartmentAndSection(String department, String section);

    List<Student> findStudentsBySection(String section);
}
