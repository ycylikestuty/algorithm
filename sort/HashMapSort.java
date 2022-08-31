package sort;

import java.util.*;

public class HashMapSort {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        ArrayList<Student> student=new ArrayList<>();
        student.add(new Student(23,1));
        student.add(new Student(23,4));
        student.add(new Student(45,3));
        student.add(new Student(52,2));
        for(Student student1:student){//id为key，成绩为value
            hashMap.put(student1.getId(),student1.getScore());
        }

        System.out.println("按key排序:");
        //按key排序
        //TreeMap的内部是有序的，默认根据key进行排序
        TreeMap<Integer,Integer> sortmap=new TreeMap<>(hashMap);
        for(Object key:sortmap.keySet()){
            System.out.println(key);
        }


        System.out.println("按value排序:");
        //按value排序
        //一般需要借助于List和Comparator
        Comparator<Map.Entry<Integer,Integer>> cmp=new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        };
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(hashMap.entrySet());
        list.sort(cmp);
        for(Map.Entry entry:list){
            System.out.println(entry.getKey());
        }

    }
}
