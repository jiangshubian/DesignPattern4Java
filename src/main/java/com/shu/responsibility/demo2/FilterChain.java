package com.shu.responsibility.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2018/6/12.
 */
public class FilterChain implements Filter {

    //用List集合来存储过滤规则对象
    List<Filter> filterList = new ArrayList<Filter>();

    //用于标记规则的引用顺序
    int index = 0;

    public FilterChain addFilter(Filter filter) {
        filterList.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response, FilterChain chain) {
        if (index == filterList.size()) //last one
            return;

        //每添加一个过滤规则，index自增1
        Filter filter = filterList.get(index++);

        //根据索引值获取对应的规律规则对字符串进行处理
        filter.doFilter(request, response, chain);

    }
}
