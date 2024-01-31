import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingTest {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(10, "가"));
        list.add(new Student(10, "나"));
        list.add(new Student(10, "라"));
        list.add(new Student(10, "다"));
        list.add(new Student(10, "바"));

        //기본정렬 : no 오름차순
        Collections.sort(list);
        System.out.println(list);

        //학번이 같을경우 이름순
        Collections.sort(list, SortingTest::compare);

        System.out.println(list);

    }

    private static int compare(Student s1, Student s2) {

        String s1Name = s1.getName();
        String s2Name = s2.getName();
        Integer s1No = s1.getNo();
        Integer s2No = s2.getNo();
        if(s1No==s2No)
            return s1Name.compareTo(s2Name);
        else
            return Integer.compare(s1No,s2No);

    }

}