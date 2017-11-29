package com.shu.observer.first.impl;

import com.shu.observer.first.IHanFeiZi;

/**
 * 实现类
 * @author: jiangshubian
 * @Description:
 * @Date: Create in 2017-11-29 20:24
 * @Version: 1.0.0
 */
public class HanFeiZi implements IHanFeiZi {

    private boolean isHaveBreakfast = false;
    private boolean isHaveFun = false;

    public void haveBreakfast() {
        System.out.println("HanFeiZi.haveBreakfast");
        this.isHaveBreakfast = true;
    }

    public void haveFun() {
        System.out.println("HanFeiZi.haveFun");
        this.isHaveFun = true;
    }

    public boolean isHaveBreakfast() {
        return isHaveBreakfast;
    }

    public void setHaveBreakfast(boolean haveBreakfast) {
        isHaveBreakfast = haveBreakfast;
    }

    public boolean isHaveFun() {
        return isHaveFun;
    }

    public void setHaveFun(boolean haveFun) {
        isHaveFun = haveFun;
    }
}
