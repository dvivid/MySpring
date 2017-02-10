package com.mk.dy.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author dvivid
 * @version V1.0
 * @Title CopyOnWriteArrayLists
 * @Package com.mk.dy.concurrent
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/15
 */
public class CopyOnWriteArrayLists {

    public static void main(String[] args) throws InterruptedException {
        final List<String> concurrentList = new CopyOnWriteArrayList<String>();
        concurrentList.add("1");
        concurrentList.add("2");
        concurrentList.add("3");
        concurrentList.add("4");


        Thread t  = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while(true){
                    concurrentList.add(i+++"");
                }
            }
        });
        t.setDaemon(true);
        t.start();
        Thread.currentThread().sleep(3);
        for (String s : concurrentList){
            System.out.println(s);
        }


    }


}
