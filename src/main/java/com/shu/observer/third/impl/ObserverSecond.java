package com.shu.observer.third.impl;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 23:50
 * @Version: 1.0.0
 */
public class ObserverSecond implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("ObserverSecond.update");
        System.out.println(o);
        System.out.println(arg);
    }
}
