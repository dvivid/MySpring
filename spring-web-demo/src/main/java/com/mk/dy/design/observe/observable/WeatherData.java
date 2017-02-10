package com.mk.dy.design.observe.observable;

import com.mk.dy.design.observe.observer.IObserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**

 * @author dvivid
 * @version V1.0
 * @Title WeatherData
 * @Package com.mk.dy.design.observe.observable
 * <p/>
 * *****************************************
 * @Description
 * @date 2016/7/1
 */
public class WeatherData implements IObservable{

    private Map<String,Object> data;

    private boolean changed = false;
    private ArrayList<IObserver> obs;

    public WeatherData(){
        obs = new ArrayList();
        data = new HashMap<String, Object>();
    }

    public void setChanged() {
        changed = true;
    }

    public void clearChanged() {
        changed = false;
    }

    public void addObserver(IObserver observer) {
        if(!obs.contains(observer)){
            obs.add(observer);
        }

    }

    public void deleteObserver(IObserver observer) {
        int idx = obs.indexOf(observer);
        if(idx != -1){
            obs.remove(idx);
        }

    }

    public void notifyObservers() {
        for(IObserver observer : obs){
            observer.update(this,data);
        }
    }

    public void changeData(int a,int b){
        this.data.put("a",a);
        this.data.put("b",b);
        notifyObservers();
    }


}
