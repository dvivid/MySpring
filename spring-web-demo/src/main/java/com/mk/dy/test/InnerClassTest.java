package com.mk.dy.test;

/**

 * @author dvivid
 * @version V1.0
 * @Title InnerClassTest
 * @Package com.mk.dy.test
 * <p>
 * *****************************************
 * @Description
 * @date 2017/1/9
 */
public class InnerClassTest {


    public void outM1(){
        System.out.println("outerclass.outM1 call");
    }

    class NormalInner{

        public void m1(){
            System.out.println("NormalInner.m1 call");
            outM1();
        }
    }



    static class StaticInner{

        public void m1(){
            System.out.println("static inner class call");
        }
    }

    public static void main(String[] args) {
        InnerClassTest innerClassTest = new InnerClassTest();
        //创建内部类时，声明都需要用到外部类来引用，定义过程，普通内部类，需要用到外部类实例，静态内可以直接使用外部类
        InnerClassTest.NormalInner normalInner = innerClassTest.new NormalInner();
        normalInner.m1();

        InnerClassTest.StaticInner staticInner = new InnerClassTest.StaticInner();
        staticInner.m1();
    }

}
