package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();

        students.add(new Student(23,1));
        students.add(new Student(52,2));
        students.add(new Student(45,3));
        students.add(new Student(23,4));
        Comparator<Student> cmp=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore()-o1.getScore();
            }
        };


        students.sort(cmp);

        for(Student student1:students){
            System.out.print(student1.getId()+" ");
        }
    }
}
