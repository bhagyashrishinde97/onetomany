
/*public class Subject {

    private final String subname;
    @Id
    @Column(name="subject_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SubjectId;
    @Column(name="subject_name")
    private String Subname;
    @ManyToOne
    @JoinColumn(name="student_id")
    private Student student;
    public Subject(String subname) {
        super();
        this.subname = subname;
    }

    // Parameterized constructor
    public Subject(String subname, Student student) {
        this.subname = subname;
        this.student = student;
    }





    public int getSubjectId() {
        return SubjectId;
    }

    public void setSubjectId(int subjectId) {
        SubjectId = subjectId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSubname() {
        return Subname;
    }

    public void setSubname(String subname) {
        Subname = subname;
    }


}*/
package org.example;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subject_id")
    private int subjectId;

    @Column(name = "subject_name")
    private String subname;

    @ManyToOne
    @JoinColumn(name = "student_id")

    private Student student;

    // No-argument constructor for Hibernate
    public Subject() {
    }

    // Constructor with arguments
    public Subject(String subname, Student student) {
        this.subname = subname;
        this.student = student;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
