package Classroom;

import java.util.List;

public class Student implements Nameable, HasLevel{

    List<Double> grades;
     String name;
     private Level stulevel;

    public Student(List<Double> grades) {
        this.grades = grades;
        this.stulevel= stulevel;
    }




    double getAveragegrade(){
      /*  double sum= 0;
        for(int i =0;i< grades.size();i++){
            sum+= grades.get(i);


        }
        double avg = sum/ grades.size();
        return avg;*/
        return  grades.stream().reduce(0.0,Double::sum)/grades.size();
    }

     @Override
    public String getName() {
         return name;
    }


@Override
public void setName(String name) {
        this.name = name;
    }

    @Override
    public Level getLevel() {
        return stulevel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                ", name='" + name + '\'' +
                ", student level=" + stulevel +
                '}';
    }
}