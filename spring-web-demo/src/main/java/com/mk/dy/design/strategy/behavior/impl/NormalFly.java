package com.mk.dy.design.strategy.behavior.impl;

import com.mk.dy.design.strategy.behavior.IFlyable;

/**

 * @author dvivid
 * @version V1.0
 * @Title NormalFly
 * @Package com.mk.dy.design.strategy.behavior.impl
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/30
 */
public class NormalFly implements IFlyable {
    public void fly() {
        System.out.println("普通飞行模式");
    }
}
