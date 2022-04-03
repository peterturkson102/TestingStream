package Classroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    List<Double> gradings = new ArrayList<Double>();
    @BeforeEach
    void setUp(){

        gradings.add(30.2);
        gradings.add(20.2);
        gradings.add(10.2);

    }

    @Test
    void getAveragegrade() {

        NaughtyStudent kwame = new NaughtyStudent(gradings);
        Student kwames = new Student(gradings);
         double naughty = kwame.getAveragegrade();
         double actual = kwames.getAveragegrade();

         assertNotEquals(actual,naughty);
        double percinc = (naughty/actual)*10;
        System.out.println("naughty student average: "+naughty);
        System.out.println("actual student average: "+actual);
      //  System.out.println("Increase in grade by "+percinc);
    }
}