package com.shu.strategy;

/**
 * 策略枚举
 *
 * @ClassName EnumCalculator
 * @Description
 * @Author jiangshubian
 * @Date 2020/3/8 14:56
 * @Version 1.0
 */
public enum EnumCalculator {
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    },
    UNKNOWN("?") {
        @Override
        public int exec(int a, int b) {
            return 0;
        }
    };

    private String value;

    EnumCalculator(String value) {
        this.value = value;
    }

    public static EnumCalculator symbol(String symbol) {
        EnumCalculator[] enumCalculators = EnumCalculator.values();
        for (EnumCalculator enumCalculator : enumCalculators) {
            if (enumCalculator.getValue().equals(symbol)) {
                return enumCalculator;
            }
        }
        return EnumCalculator.UNKNOWN;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);
}
