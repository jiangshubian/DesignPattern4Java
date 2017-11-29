package com.shu.observer.second.impl;

import com.shu.observer.second.Observer;

/**
 * 实现类
 *
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 20:24
 * @Version: 1.0.0
 */
public class WangSi implements Observer {
    public void update(String context) {
        System.out.println("WangSi.update");
        this.reportTo(context);
        System.out.println("WangSi.over!");
    }

    private void reportTo(String context) {
        System.out.println("WangSi Say somethings to others :" + context);
    }
}
