package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueSort {
    public static void main(String[] args) {
        ArrayList<Student> student=new ArrayList<>();
        student.add(new Student(23,1));
        student.add(new Student(52,2));
        student.add(new Student(45,3));
        student.add(new Student(23,4));
        Comparator<Student> cmp=new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore()==o1.getScore()
                        ?o1.getId()-o2.getId():o2.getScore()-o1.getScore();
            }//按照成绩从高到低排序，若成绩相等，则按照id从小到大排序
        };
        PriorityQueue queue=new PriorityQueue(cmp);
        for(Student x:student){
            queue.offer(x);
        }
        while (!queue.isEmpty()){
            Student a= (Student) queue.poll();
            System.out.print(a.getId()+" ");
        }
    }
}
