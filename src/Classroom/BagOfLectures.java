package Classroom;
import java.util.ArrayList;
import java.util.List;

public class BagOfLectures {
    List<Lecture> bagg = new ArrayList<Lecture>();
    public void add(Lecture lecture){
        bagg.add(lecture);
    }
    public void remove(Lecture lecture){
        bagg.remove(lecture);
    }
    public void clear(Lecture lecture){
        bagg.clear();
    }


}
