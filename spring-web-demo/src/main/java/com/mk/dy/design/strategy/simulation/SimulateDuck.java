package com.mk.dy.design.strategy.simulation;

import com.mk.dy.design.strategy.behavior.impl.NoCanFly;
import com.mk.dy.design.strategy.behavior.impl.NoCanQuack;
import com.mk.dy.design.strategy.behavior.impl.NormalFly;
import com.mk.dy.design.strategy.duck.Duck;
import com.mk.dy.design.strategy.duck.impl.FlyDuck;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title SimulateDuck
 * @Package com.mk.dy.design.strategy.simulation
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/6/30
 */
public class SimulateDuck {



    public static void main(String[] args){

        Duck flyDuck = new FlyDuck(new NormalFly(),new NoCanQuack());
        Duck noCanFly = new FlyDuck(new NoCanFly(),new NoCanQuack());

        flyDuck.fly();
        noCanFly.fly();
    }
}
