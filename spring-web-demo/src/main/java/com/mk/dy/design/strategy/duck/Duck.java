package com.mk.dy.design.strategy.duck;

import com.mk.dy.design.strategy.behavior.IFlyable;
import com.mk.dy.design.strategy.behavior.IQuackable;

import java.awt.print.Pageable;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title Duck
 * @Package com.mk.dy.design.strategy
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/30
 */
public abstract class Duck {


    private String name;



    /**
     * fly 和 quack 是duck类的变化部分，把他们抽出去，单独成接口，在组合到鸭子类
     * 使用组合，不使用继承
     */
    private IFlyable flyable;
    private IQuackable quackable;

    public Duck(IFlyable flyable,IQuackable quackable){
        this.flyable = flyable;
        this.quackable = quackable;
    }

    public void swim(){
        System.out.println("can swim");
    }

    public void fly(){
        flyable.fly();
    }

    public void quack(){
        quackable.quack();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IFlyable getFlyable() {
        return flyable;
    }

    public void setFlyable(IFlyable flyable) {
        this.flyable = flyable;
    }

    public IQuackable getQuackable() {
        return quackable;
    }

    public void setQuackable(IQuackable quackable) {
        this.quackable = quackable;
    }
}
