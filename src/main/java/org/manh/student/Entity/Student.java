package org.manh.student.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private Integer age;
    private String department;
    private String section;


    public Student() {
    }

    public Student(Integer id, String firstName, String lastName, Long phoneNumber, Integer age, String department, String section) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.department = department;
        this.section = section;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", section='" + section + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(getId(), student.getId()) && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getPhoneNumber(), student.getPhoneNumber()) && Objects.equals(getAge(), student.getAge()) && Objects.equals(getDepartment(), student.getDepartment()) && Objects.equals(getSection(), student.getSection());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getPhoneNumber(), getAge(), getDepartment(), getSection());
    }

    //    public Student(Integer id, String name, Long phoneNumber, String email, Integer age, String branch) {
//        this.id = id;
//        this.firstName = name;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.age = age;
//        this.branch = branch;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return firstName;
//    }
//
//    public void setName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public Long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(Long phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getBranch() {
//        return branch;
//    }
//
//    public void setBranch(String branch) {
//        this.branch = branch;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", firstName='" + firstName + '\'' +
//                ", phoneNumber=" + phoneNumber +
//                ", email='" + email + '\'' +
//                ", age=" + age +
//                ", branch='" + branch + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(getId(), student.getId()) && Objects.equals(getName(), student.getName()) && Objects.equals(getPhoneNumber(), student.getPhoneNumber()) && Objects.equals(getEmail(), student.getEmail()) && Objects.equals(getAge(), student.getAge()) && Objects.equals(getBranch(), student.getBranch());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getName(), getPhoneNumber(), getEmail(), getAge(), getBranch());
//    }

    //    public Student(String name, Integer age, Long phoneNumber) {
//        this.name = name;
//        this.age = age;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public Long getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setNumber(Long phoneNumber) {
//        this.phoneNumber = this.phoneNumber;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", number=" + phoneNumber +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(getId(), student.getId()) && Objects.equals(getName(), student.getName()) && Objects.equals(getAge(), student.getAge()) && Objects.equals(getPhoneNumber(), student.getPhoneNumber());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getName(), getAge(), getPhoneNumber());
//    }
}
