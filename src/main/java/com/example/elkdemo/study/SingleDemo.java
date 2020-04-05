package com.example.elkdemo.study;

/**
 * 使用volatile禁止指令重排序的单例模式
 *
 * @author chenfu
 * @Date 2020/4/5
 */
public class SingleDemo {

    private static volatile SingleDemo singleDemo = null;

    /**
     * 私有的构造方法
     */
    private SingleDemo() {
        System.out.println("执行构造方法");
    }

    public static SingleDemo getInstance() {
        if (singleDemo == null) {
            synchronized (SingleDemo.class) {
                if (singleDemo == null) {
                    singleDemo = new SingleDemo();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            new Thread(() -> {
                SingleDemo.getInstance();
            }, String.valueOf(i)).start();
        }
    }
}
