package org.manh.student.Controller;

import org.manh.student.Entity.Student;
import org.manh.student.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "http://localhost:4200") // Restrict to Angular app
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * Get all students.
     */
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    /**
     * Get a student by ID.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        return student != null ? ResponseEntity.ok(student) : ResponseEntity.notFound().build();
    }

    /**
     * Find students by age greater than a specific value.
     */
    @GetMapping("/age/{age}")
    public ResponseEntity<List<Student>> findStudentsByAgeGreaterThan(@PathVariable Integer age) {
        List<Student> students = studentService.findStudentsByAgeGreaterThan(age);
        return ResponseEntity.ok(students);
    }

    /**
     * Add a new student.
     */
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        student.setId(null); // Ensure the ID is null for a new student
        Student createdStudent = studentService.addStudent(student);
        return ResponseEntity.ok(createdStudent);
    }

    /**
     * Update a student by ID.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {
        Student updatedStudent = studentService.updateStudent(id, student);
        return updatedStudent != null ? ResponseEntity.ok(updatedStudent) : ResponseEntity.notFound().build();
    }

    /**
     * Find students by department and/or age.
     */
    @GetMapping("/search")
    public ResponseEntity<List<Student>> findStudentsByDepartmentAndSection(
            @RequestParam(value = "department", required = false) String department,
            @RequestParam(value = "section", required = false) String section) {
        List<Student> students = studentService.findStudentsByDepartmentAndSection(department, section);
        return ResponseEntity.ok(students);
    }

    /**
     * Delete a student by ID.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return ResponseEntity.ok("Student deleted successfully");
    }
}