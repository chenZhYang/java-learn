package com.chen.java.learn.innerclass;

import lombok.Data;

/**
 * @Author: Aaron chen
 * @Date: 2020/5/16 4:31
 * 匿名父类
 */
@Data
public abstract class AnonymousFather {
    private String name;

    /**
     * 可以飞多少米
     * @return
     */
    public abstract int fly();
}
