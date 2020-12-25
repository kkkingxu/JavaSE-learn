package com.learn.demo13.Collections;
/*
       java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
       public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。
       public static void shuffle(List<?> list) 打乱顺序:打乱集合顺序。

 */
import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加多个元素
        /*list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");*/

        //public static <T> boolean addAll(Collection<T> c, T... elements):往集合中一次添加多个元素。
        Collections.addAll(list,"a","b","c","d","e");

        System.out.println(list);//[a, b, c, d, e]

        //public static void shuffle(List<?> list) 打乱集合顺序。
        Collections.shuffle(list); // 由于是静态方法，直接类名调用
        System.out.println(list);//[b, d, c, a, e], [b, d, c, a, e]
    }
}