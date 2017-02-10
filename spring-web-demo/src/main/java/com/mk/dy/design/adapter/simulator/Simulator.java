package com.mk.dy.design.adapter.simulator;

import com.mk.dy.design.adapter.adapter.TurkeyAdapter;
import com.mk.dy.design.adapter.source.Turkey;
import com.mk.dy.design.adapter.source.impl.WildTurkey;

/**

 * @author dvivid
 * @version V1.0
 * @Title Simulator
 * @Package com.mk.dy.design.adapter.simulator
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/11
 */
public class Simulator {


    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        TurkeyAdapter mockDuck = new TurkeyAdapter(turkey);

        mockDuck.quack();
        mockDuck.fly();
    }
}
