package com.shu.responsibility.demo2.impl;

import com.shu.responsibility.demo2.Filter;
import com.shu.responsibility.demo2.FilterChain;
import com.shu.responsibility.demo2.Request;
import com.shu.responsibility.demo2.Response;

/**
 * Created by lenovo on 2018/6/12.
 */
public class HTMLFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.requestStr = request.getRequest().replace("<", "]") + "----HTMLFilter()";
        chain.doFilter(request, response, chain);
        response.responseStr += "---HTMLFilter()";
    }
}
