package Classroom;

import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(List<Double> grades) {
        super(grades);

    }

    @Override
    public
    double getAveragegrade(){
      double naughtyavg;
      naughtyavg= (super.getAveragegrade()*1.1);
       return naughtyavg;
    }

}
