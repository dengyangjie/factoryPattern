package com.gupaoedu.singleton;

/**
 * Descriptions:伪单例模式
 * Author: dengyangjie
 * Date: 2019-3-20
 * Time: HH:mm:ss
 */
public class ThreadLocalSingleton {
    public static ThreadLocal<ThreadLocalSingleton> threadLocal =  new ThreadLocal<>();
    public static final ThreadLocalSingleton singleton = new ThreadLocalSingleton();
    static {
        threadLocal.set(singleton);
    }
    public static ThreadLocalSingleton getInstance(){
        return threadLocal.get();
    }

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
