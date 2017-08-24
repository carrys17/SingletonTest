package com.example.shang.singletontest;

/**
 * Created by shang on 2017/8/24.
 */

// DCL（Double Check Lock）实现单例
public class Singleton {

    // 构造函数私有
    private Singleton(){}
    // 加volatile修饰是为了避免DCL失效（ sInstance = new Singleton();不是原子性操作 ）
    private volatile static Singleton sInstance;
    public Singleton getInstance(){
        if (sInstance == null){ // 第一层为了避免不必的同步
            synchronized (Singleton.class){
                if (sInstance == null){ // 第二层是创建实例
                    sInstance = new Singleton();
                }
            }
        }
        return sInstance;
    }

}

