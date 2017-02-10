package com.mk.dy.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**

 * @author dvivid
 * @version V1.0
 * @Title IteratorTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2016/12/30
 */
public class IteratorTest {

    private static ArrayList<String> list = new ArrayList<String>(){{
        add("A");
        add("B");
        add("C");
        add("D");
    }};

    public static void listIteratorTest(){
        for(Iterator i = list.iterator();i.hasNext();){
            System.out.println(i.next());
            i.remove();
        }
    }
    public static void listIteratorTest2(){
        for(int i =0 ;i<list.size();i++){
            System.out.println(list.get(i));
            System.out.println(i);
            list.remove(i);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        listIteratorTest2();


      /*  Object[] objects = new Long[1];
        objects[0] = "i don";
        List<Object> l1 = new ArrayList<Long>();
        l1.add("i do");*/
    }


}
