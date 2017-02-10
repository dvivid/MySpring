package com.mk.dy.design.strategy.behavior.impl;

import com.mk.dy.design.strategy.behavior.IQuackable;

/**
 *
 *
 * @author dvivid
 * @version V1.0
 * @Title NormalQuack
 * @Package com.mk.dy.design.strategy.behavior.impl
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/30
 */
public class NormalQuack implements IQuackable {
    public void quack() {
        System.out.println("普通呱呱叫模式");
    }
}
