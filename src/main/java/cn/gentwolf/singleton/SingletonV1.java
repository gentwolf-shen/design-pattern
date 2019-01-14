package cn.gentwolf.singleton;

public class SingletonV1 {
    private static SingletonV1 instance = new SingletonV1();

    public static SingletonV1 getInstance() {
        return instance;
    }

    private SingletonV1() {
    }

    public void show() {
        System.out.println("singleton v1");
    }
}
