package org.manh.student.Service;

import org.manh.student.Entity.Student;
import org.manh.student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentService() {
    }

    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> findStudentsByAgeGreaterThan(Integer age) {
        return studentRepository.findStudentsByAgeGreaterThan(age);
    }
//
//    public List<Student> findStudentsByDepartmentAndSection(String department, String section) {
//        if (department == null) {
//            return studentRepository.findStudentsBySection(section);
//        } else {
//            return studentRepository.findStudentsByDepartment(department);
//        }
//    }
public List<Student> findStudentsByDepartmentAndSection(String department, String section) {
    return studentRepository.findByDepartmentAndSection(department, section);
}
    public Student updateStudent(Long id, Student student) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setFirstName(student.getFirstName());
            existingStudent.setLastName(student.getLastName());
            existingStudent.setPhoneNumber(student.getPhoneNumber());
            existingStudent.setAge(student.getAge());
            existingStudent.setDepartment(student.getDepartment());
            existingStudent.setSection(student.getSection());
            return studentRepository.save(existingStudent);
        }
        return null;
    }


}