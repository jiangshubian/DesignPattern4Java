package com.shu.observer.third.impl;

import java.util.Observable;

import com.shu.observer.ThreadPoolUtils;
import com.shu.observer.first.IHanFeiZi;

/**
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 23:48
 * @Version: 1.0.0
 */
public class HanFeiZiThird extends Observable implements IHanFeiZi {
    public void haveBreakfast() {
        System.out.println("HanFeiZiThird.haveBreakfast");
        ThreadPoolUtils.executorService.execute(new Runer("haveBreakfast"));
    }

    public void haveFun() {
        System.out.println("HanFeiZiThird.haveFun");
        ThreadPoolUtils.executorService.execute(new Runer("haveFun"));
    }

    private class Runer implements Runnable {

        private String context;

        public Runer(String context) {
            this.context = context;
        }

        @Override
        public void run() {
            setChanged();
            notifyObservers(context);
        }
    }
}
