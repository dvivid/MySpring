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
public class NoCanFly implements IFlyable {
    public void fly() {
        System.out.println("无法飞行模式");
    }
}
