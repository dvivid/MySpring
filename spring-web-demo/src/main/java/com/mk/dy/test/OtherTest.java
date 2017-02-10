package com.mk.dy.test;


import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**

 * @author dvivid
 * @version V1.0
 * @Title OtherTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2017/1/10
 */
public class OtherTest {


    public static void listtest(){
        List<String> list =new ArrayList(Arrays.asList("1","2"));
        for(String s : list){
            if(s.equals("1")){
                list.remove(s);
            }
            System.out.println(s);
        }
    }

    /**
     * io test
     */
    public static void iotest(){
        final String PATH = "d:\\desk\\TE.txt";
        FileWriter w = null;
        try {
            w = new FileWriter(PATH);
            w.write("hello world");
            w.flush();
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * wait notify synchronized test
     */
    static class ProducerThread extends Thread{
        private Queue<Integer> queue;
        private int maxSize;


        public ProducerThread(Queue<Integer> queue,int maxSize,String name){
            super(name);
            this.queue = queue;
            this.maxSize = maxSize;
        }

        @Override
        public void run() {
            int j  = 0;
             while (true){
                 synchronized (queue){
                     System.out.println("producer 第"+j+"次获得锁");
                     while (queue.size() == maxSize){
                         try {
                             System.out.println("queue full,wait for consumer");
                             System.out.println("consumer 即将 wait");
                             queue.wait();
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }
                     }
                     Random random = new Random();
                     int i = random.nextInt();
                     System.out.println("producing value :"+i);
                     queue.add(i);
                     queue.notifyAll();
                     j++;
                 }
             }
        }
    }


    static class ConsumerThread extends Thread{
        private Queue<Integer> queue;
        private int maxSize;


        public ConsumerThread(Queue<Integer> queue,int maxSize,String name){
            super(name);
            this.queue = queue;
            this.maxSize = maxSize;
        }

        @Override
        public void run() {
            int i = 0;
            while (true){
                synchronized (queue){
                    System.out.println("consumer 第"+i+"次获得锁");
                    while (queue.isEmpty()){
                        try {
                            System.out.println("queue empty,wait for producer");
                            System.out.println("consumer 即将 wait");
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println("consumer value :"+queue.remove());
                    queue.notifyAll();
                    i++;
                }
            }
        }
    }

    public static void testProducerConsumer(){
        Queue<Integer> queue = new LinkedList<Integer>();
        int maxSize = 10;
        ProducerThread producerThread = new ProducerThread(queue,maxSize,"producer");
        ConsumerThread consumerThread = new ConsumerThread(queue,maxSize,"producer");
        producerThread.start();
        consumerThread.start();
    }

    public static void main(String[] args) {
        //iotest();
        testProducerConsumer();
    }


}
