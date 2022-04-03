package Classroom;

import java.util.ArrayList;
import java.util.List;

public class BagofStudents {
    List<Student> bag= new ArrayList<Student>();
    public void add(Student student){
        bag.add(student);
    }
    public void remove(Student student){
      bag.remove(student);
    }
    public void clear(Student student){
     bag.clear();
    }
}
