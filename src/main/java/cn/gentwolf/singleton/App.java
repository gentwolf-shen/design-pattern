package cn.gentwolf.singleton;

/**
 * 一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
 * 这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 */
public class App {
    public static void main(String[] args) {
        SingletonV1.getInstance().show();

        SingletonV2.getInstance().show();

        SingletonV3.getInstance().show();
    }
}
