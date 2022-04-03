package Classroom;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
List<Student> studentss = new ArrayList<Student>();


    void enter(Student student) {


        System.out.println("Here are this student's grades");
        for (int i = 0; i < student.grades.size(); i++) {
            System.out.println(student.grades.get(i));
        }

        studentss.add(student);
    }

    double getHighestAverageGrade() {

        return studentss.stream().mapToDouble(Student::getAveragegrade).max().getAsDouble();
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "studentss=" + studentss +
                '}';
    }
}