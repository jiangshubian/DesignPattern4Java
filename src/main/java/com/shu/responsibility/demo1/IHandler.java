package com.shu.responsibility.demo1;

import com.shu.responsibility.demo1.req.IWomen;

/**
 * Created by lenovo on 2018/6/10.
 */
public interface IHandler {

    void handlerMessage(IWomen women);

    void setNextHandler(IHandler handler);

    void response(IWomen women);
}
