package com.mk.dy.design.decorator.component;

import com.mk.dy.design.decorator.base.Beverage;

/**

 * @author dvivid
 * @version V1.0
 * @Title CoffeeOne
 * @Package com.mk.dy.design.decorator.component
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/4
 */
public class CoffeeOne extends Beverage {

    public CoffeeOne(String desc){
        this.description = desc  = "coffee1";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
