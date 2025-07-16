package com.itheima._02ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Demo021
 * @Author jeanAulis
 * @Date 2025-07-16
 */
public class Demo021 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        System.out.println("arrayList1元素个数：" + arrayList.size());

        Object val = arrayList.get(1);
        System.out.println(val);


        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(123);
        arrayList3.add(132);
        arrayList3.add(321);

        List<Integer> list1 = new ArrayList<>();

        List<String> list2 = new ArrayList<>(20);
        list2.add("迪丽热巴");
        list2.add("刘亦菲");
        list2.add("陈奕迅");
        list2.add("古天乐");

        System.out.println("初始化数组元素：" + list2);
        list2.add("jeanAulis");
        System.out.println("插入后数据：" + list2);
        String name = list2.get(3);
        System.out.println("获取指定索引位置的元素：" + name);

        int count = list2.size();
        System.out.println("获取数组元素个数：" + count);

        list2.set(1, "234");
        System.out.println("修改指定索引位置的元素：" + list2);

        list2.remove(2);
        System.out.println("删除指定索引位置的元素：" + list2);

        list2.remove("jeanAulis");
        System.out.println("删除jeanAulis：" + list2);
    }
}
