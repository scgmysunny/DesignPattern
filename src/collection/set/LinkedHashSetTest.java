package collection.set;

import java.util.LinkedHashSet;

/**
 * Created by suchen on 2018/1/3.
 */
public class LinkedHashSetTest {
    public static void main(String[] args)
    {
        LinkedHashSet books = new LinkedHashSet();
        books.add("Java");
        books.add("LittleHann");

        System.out.println(books);

        //删除 Java
       books.remove("Java");
        //重新添加 Java
        books.add("Java");
        System.out.println(books);
    }
}

