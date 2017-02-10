package com.mk.dy.design.observe.simulator;

import com.mk.dy.design.observe.observable.WeatherData;
import com.mk.dy.design.observe.observer.IObserver;
import com.mk.dy.design.observe.observer.ObserverOne;
import com.mk.dy.design.observe.observer.ObserverTwo;

/**

 * @author dvivid
 * @version V1.0
 * @Title Simulator
 * @Package com.mk.dy.design.observe.simulator
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/1
 */
public class Simulator {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        IObserver observerone = new ObserverOne(weatherData);
        IObserver observertwo = new ObserverTwo(weatherData);
        weatherData.changeData(2,3);

        weatherData.changeData(3,2);


    }
}
