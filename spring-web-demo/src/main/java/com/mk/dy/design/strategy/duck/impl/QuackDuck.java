package com.mk.dy.design.strategy.duck.impl;

import com.mk.dy.design.strategy.behavior.IFlyable;
import com.mk.dy.design.strategy.behavior.IQuackable;
import com.mk.dy.design.strategy.duck.Duck;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title FlyDuck
 * @Package com.mk.dy.design.strategy.duck.impl
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/30
 */
public class QuackDuck extends Duck {

    public QuackDuck(IFlyable flyable, IQuackable quackable){
        super(flyable,quackable);
    }
}
