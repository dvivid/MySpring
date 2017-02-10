package com.mk.dy.design.decorator.component;

import com.mk.dy.design.decorator.base.Beverage;

/**
 *
 * @author dvivid
 * @version V1.0
 * @Title CoffeeOne
 * @Package com.mk.dy.design.decorator.component
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/4
 */
public class CoffeeTwo extends Beverage {

    public CoffeeTwo(String desc){
        this.description = desc = "coffee2";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
