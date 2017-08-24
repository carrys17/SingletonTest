package com.example.shang.singletontest;

/**
 * Created by shang on 2017/8/24.
 */

// 静态内部类实现单例
public class Singleton2 {
    // 构造函数私有
    private Singleton2(){}
    // 用一个静态类包装一个饿汉式。
    // 当第一次加载Singleton2类时不会初始化sInstance，只有第一次调用了getInstance()方法才会初始化sInstance
    private static class SingletonHolder{
        private static final Singleton2 sInstance = new Singleton2();
    }

    public Singleton2 getInstance(){
        return SingletonHolder.sInstance;
    }
}
