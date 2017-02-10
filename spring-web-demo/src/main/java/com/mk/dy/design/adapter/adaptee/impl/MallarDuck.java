package com.mk.dy.design.adapter.adaptee.impl;


import com.mk.dy.design.adapter.adaptee.Duck;

/**

 * @author dvivid
 * @version V1.0
 * @Title MallarDuck
 * @Package com.mk.dy.design.adapter.adaptee.impl
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/11
 */
public class MallarDuck implements Duck {
    public void quack() {
        System.out.println("quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
