package com.shu.responsibility.demo1;

import com.shu.responsibility.demo1.req.IWomen;

/**
 * Created by lenovo on 2018/6/10.
 */
public abstract class Handler implements IHandler {
    //使用level区分不同责任链中对象
    public final static int FATHER_LEVEL_REQUEST = 1;
    public final static int HUSBAND_LEVEL_REQUEST = 2;
    public final static int SON_LEVEL_REQUEST = 3;


    protected int level;
    protected IHandler nextHandler;

    //强制继承者指出自己身份
    public Handler(int level) {
        this.level = level;
    }

    public void handlerMessage(IWomen women) {
        System.out.println(this.level + "---" + women.getType());
        if (women.getType() == this.level) {
            this.response(women);
        } else if (this.nextHandler != null) {
            this.nextHandler.handlerMessage(women);
        } else {
            System.out.println("Handler.handlerMessage");
        }
    }

    public void setNextHandler(IHandler handler) {
        this.nextHandler = handler;
    }
}
