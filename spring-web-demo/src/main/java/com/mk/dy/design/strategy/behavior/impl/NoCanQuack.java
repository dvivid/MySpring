package com.mk.dy.design.strategy.behavior.impl;

import com.mk.dy.design.strategy.behavior.IQuackable;

/**

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
public class NoCanQuack implements IQuackable {
    public void quack() {
        System.out.println("不会呱呱叫模式");
    }
}
