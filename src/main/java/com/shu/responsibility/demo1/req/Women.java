package com.shu.responsibility.demo1.req;

/**
 * Created by lenovo on 2018/6/10.
 */
public class Women implements IWomen {

    private int level;

    public Women(int level) {
        this.level = level;
    }

    public int getType() {
        return this.level;
    }

    public String getRequest() {
        return "abc";
    }
}
