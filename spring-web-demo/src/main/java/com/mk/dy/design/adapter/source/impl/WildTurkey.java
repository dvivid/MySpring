package com.mk.dy.design.adapter.source.impl;

import com.mk.dy.design.adapter.source.Turkey;

/**

 * @author dvivid
 * @version V1.0
 * @Title WildTurkey
 * @Package com.mk.dy.design.adapter.source.impl
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/11
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
