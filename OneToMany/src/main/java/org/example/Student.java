package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {



    @Id
        @Column(name = "student_id")
         @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int StudentId;


        //  @ManyToOne
        // @JoinColumn(name="student_id")
        @Column(length = 50)
        private String name;
    @OneToMany(mappedBy="student", cascade= CascadeType.ALL)
        private  List<Subject> subjects;
    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }


    public Student() {
        super();

    }

    public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getStudentId() {
                return StudentId;
        }

        public void setStudentId(int studentId) {
                StudentId = studentId;
        }

        public List<Subject> getSubject() {
                return subjects;
        }

        public void setSubject(List<Subject> subject) {
                this.subjects = subject;
        }

    public void setSubjects(List<Subject> subList) {
    }
}


