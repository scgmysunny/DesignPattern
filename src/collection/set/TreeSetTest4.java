package collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by suchen on 2018/1/8.
 */

class M {
    int age;

    public M(int age) {
        this.age = age;
    }

    public String toString() {
        return "M[age:" + age + "]";
    }
}

public class TreeSetTest4 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                M m1 = (M) o1;
                M m2 = (M) o2;
                return m1.age > m2.age ? -1 : m1.age < m2.age ? 1 : 0;
            }
        });
        ts.add(new M(5));
        ts.add(new M(-3));
        ts.add(new M(9));
        System.out.println(ts);



    }
}
