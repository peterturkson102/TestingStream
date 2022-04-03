package Classroom;

import java.util.*;
import java.util.stream.Collectors;

public class Register  {
List<Student> names = new ArrayList<Student>();


    public Register(List<Student> objs) {
        this.names = objs;
    }

    List<String> getRegister(){


      return  names.stream().map(Nameable::getName).collect(Collectors.toList());


    }
/*
    List<Nameable> getRegisterByLevel (Level level ){
    return  names.stream() .filter(x -> x.getLevel().equals(level))
                .collect(Collectors.toList());
                }
*/
   public void getRegisterBylevel() {
       Map<Level, List<Student>> classes = names.stream().collect(Collectors.groupingBy(Student::getLevel));
       classes.forEach((level, studentt) -> {
                   System.out.println(level);
                   studentt.forEach(System.out::println);
               }
       );



   }

    public Double gethighestGrade() {
        return names.stream().mapToDouble(Student::getAveragegrade).max().getAsDouble();
    }


    //Question 4 be stress

    public void printReport(List<Nameable> nameable) {
        Map<Level, List<Nameable>> collect =
                nameable.stream().collect(Collectors.groupingBy(Nameable::getLevel));
        collect.forEach((level, nameable1) -> {
            System.out.println(level);
            nameable1.forEach(System.out::println);
        });
    }


    public void sort(){
       names.stream().sorted(Comparator.comparing(Student::getName));


    }

    public void getRegisterByName(String name){

        names.stream().filter(x -> Boolean.parseBoolean(String.valueOf(x.getName().equals(name))));


    }

    public Optional<Student> getStudentByName(List<Student> nameable, String name) {
        return names.stream().filter(x -> x.getName().equals(name)).findFirst();
    }

    @Override
    public String toString() {
        return "Register{" +
                "names=" + names +
                '}';
    }
}
