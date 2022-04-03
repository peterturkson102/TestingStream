package Classroom;

import java.util.ArrayList;
import java.util.List;

public class Bag <T>{


    List<T> bagg= new ArrayList<>();
    public void add(T t) {
        bagg.add(t);
    }


    public void remove(T t) {bagg.remove(t);
    }

    public void clear() {
        bagg.clear();
    }

}
