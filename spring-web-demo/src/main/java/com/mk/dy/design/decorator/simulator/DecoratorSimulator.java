package com.mk.dy.design.decorator.simulator;

import com.mk.dy.design.decorator.base.Beverage;
import com.mk.dy.design.decorator.component.CoffeeOne;
import com.mk.dy.design.decorator.wrapper.CondimentOne;

/**

 *
 * @author dvivid
 * @version V1.0
 * @Title DecoratorSimulator
 * @Package com.mk.dy.design.decorator.simulator
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/4
 */
public class DecoratorSimulator {

    public static void main(String[] args) {
        Beverage coffee1 = new CoffeeOne("");

        System.out.println(coffee1.getDescription());
        //给coffee1增加调料
        coffee1 = new CondimentOne(coffee1);
        System.out.println(coffee1.getDescription());

    }
}
