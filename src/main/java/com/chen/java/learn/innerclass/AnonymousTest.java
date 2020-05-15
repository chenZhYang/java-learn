package com.chen.java.learn.innerclass;

/**
 * @Author: Aaron chen
 * @Date: 2020/5/16 4:34
 * 匿名内部类测试
 * 匿名内部类我们必须要继承一个父类或者实现一个接口，当然也仅能只继承一个父类或者实现一
 * 个接口。同时它也是没有 class 关键字，这是因为匿名内部类是直接使用 new 来生成一个对象的引
 * 用
 */
public class AnonymousTest {
    public void test(AnonymousFather anonymousFather){
        System.out.println(anonymousFather.getName()+"能够飞"+anonymousFather.fly()+"米");
    }

    public void testInterface(AnonymousInterface anonymousInterface){
        System.out.println(anonymousInterface.getName()+"能够飞"+anonymousInterface.fly()+"米");
    }

    public static void main(String[] args) {
        AnonymousTest anonymousTest = new AnonymousTest();
        //测试继承父类实现匿名内部类
        anonymousTest.test(new AnonymousFather() {

            @Override
            public String getName(){
                return "大雁";
            }

            @Override
            public int fly() {
                return 1110;
            }
        });

        //测试实现接口实现匿名内部类
        anonymousTest.testInterface(new AnonymousInterface() {
            @Override
            public int fly() {
                return 111110;
            }

            @Override
            public String getName() {
                return "雄鹰";
            }
        });
    }
}
