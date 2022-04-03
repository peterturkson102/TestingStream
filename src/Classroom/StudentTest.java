package Classroom;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @org.junit.jupiter.api.Test
    void getAveragegrade() {
        List<Double> gradings= new ArrayList<Double>();
        gradings.add(30.2);
        gradings.add(20.2);
        gradings.add(10.2);
        Student kwame = new Student(gradings);

        assertEquals(20.2, kwame.getAveragegrade() );
    }
}