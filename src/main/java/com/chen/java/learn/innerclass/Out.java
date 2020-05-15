package com.chen.java.learn.innerclass;

/**
 * @Author: Aaron chen
 * @Date: 2020/5/16 2:44
 * java内部类
 */
public class Out {
    private static int a;
    private String b;

    /**
     *定义在类内部的非静态类，就是成员内部类。成员内部类不能定义静态方法和变量（final 修饰的
     * 除外）。这是因为成员内部类是非静态的，类初始化的时候先初始化静态成员，如果允许成员内
     * 部类定义静态变量，那么成员内部类的静态变量初始化顺序是有歧义的。
     */
    public class Inner{
        int c;

    }

    /**
     * 内部静态类可以定义静态变量和方法
     * 1. 静态内部类可以访问外部类所有的静态变量和方法，即使是 private 的也一样。
     * 2. 静态内部类和一般类一致，可以定义静态变量、方法，构造方法等。
     */
    public static class Inner1{
        static int d;

        public static void test(){

        }
    }

    /**
     * 局部类
     * 定义在方法中的类，就是局部类。如果一个类只在某个方法中使用，则可以考虑使用局部类
     */
    public void test(){
        int d = 1;
        class Inner{
            public void print(){
                System.out.println("此乃局部类");
            }
        }
        Inner inner = new Inner();
        inner.print();
    }


}
