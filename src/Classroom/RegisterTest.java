package Classroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    List<Double> gradings= new ArrayList<Double>();

    Nameable james = new Student(gradings);
    Nameable kwame = new Student(gradings);
    Nameable jimmy = new Student(gradings);





    @Test
    void getRegister() {


        List<Nameable> mathclass = null;
        mathclass.add(james);
        mathclass.add(jimmy);
        mathclass.add(kwame);
        jimmy.setName("jimmy");
        james.setName("james");
        kwame.setName("kwame");
        Register mathclassRegister = new Register(mathclass);


    }
}