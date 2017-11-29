package com.shu.observer.second.impl;

import java.util.ArrayList;
import java.util.List;

import com.shu.observer.first.IHanFeiZi;
import com.shu.observer.second.Observable;
import com.shu.observer.second.Observer;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 22:12
 * @Version: 1.0.0
 */
public class HanFeiZiSecond implements IHanFeiZi, Observable {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void haveBreakfast() {
        System.out.println("HanFeiZiSecond.haveBreakfast");
        this.notifyObserver("HanFeiZiSecond.haveBreakfast");
    }

    public void haveFun() {
        System.out.println("HanFeiZiSecond.haveFun");
        this.notifyObserver("HanFeiZiSecond.haveFun");

    }

    public void addObservable(Observer observer) {
        this.observerList.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyObserver(String context) {
        for(Observer observer : observerList )
            observer.update(context);
    }
}
