package com.mk.dy.design.decorator.wrapper;

import com.mk.dy.design.decorator.base.Beverage;

/**

 * @author dvivid
 * @version V1.0
 * @Title CondimentOne
 * @Package com.mk.dy.design.decorator.wrapper
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/4
 */
public class CondimentOne extends  CondimentDecorator {

    private Beverage beverage;

    public  CondimentOne(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"_condiment1";
    }

    @Override
    public double cost() {
        return 1.99+beverage.cost();
    }
}
