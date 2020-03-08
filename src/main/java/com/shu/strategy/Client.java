package com.shu.strategy;

import java.util.Arrays;

/**
 * @ClassName Client
 * @Description
 * @Author jiangshubian
 * @Date 2020/3/8 15:00
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);

        System.out.println("输入参数为：" + Arrays.toString(args));

        System.out.println("运行结果：" + EnumCalculator.symbol(symbol).exec(a, b));
    }
}
