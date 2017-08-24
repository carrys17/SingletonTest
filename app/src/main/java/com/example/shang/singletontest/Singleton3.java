package com.example.shang.singletontest;

/**
 * Created by shang on 2017/8/24.
 */

// 利用枚举实现单例
public enum Singleton3 {
    sInstance;
}
// 枚举实现起来非常简单，而且反序列时不会创建新的实例，前面的方法要避免反序列时创建新的对象就要
// 加入readResolve(){
//       return sInstance;
//     }
// 但是android中并不推荐用枚举，因为它比static占用多一倍的内存，大型的APP还是不要使用枚举为好