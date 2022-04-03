package Classroom;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void enter() {
        List<Double> gradings= new ArrayList<Double>();
        List<Double> gradingss= new ArrayList<Double>();
        gradings.add(30.2);
        gradings.add(10.2);
        gradings.add(10.2);
        Student kwame = new Student(gradings);


        gradingss.add(30.2);
        gradingss.add(210.2);
        gradingss.add(10.2);
        Student kwaku = new Student(gradingss);


        Lecture math = new Lecture();

        //adding kwaku as a naughty student
        NaughtyStudent kwakuN= new NaughtyStudent(gradingss);



       math.enter(kwame);
       math.enter(kwaku);
       math.enter(kwakuN);
       // Object entry = math.enter(kwame);

       // assertEquals(1110.2, math.getHighestAverageGrade());
        assertEquals(kwaku.getAveragegrade(),kwakuN.getAveragegrade());

    }

}