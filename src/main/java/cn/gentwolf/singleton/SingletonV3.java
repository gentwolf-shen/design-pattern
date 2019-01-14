package cn.gentwolf.singleton;

public class SingletonV3 {

    private static class SingletonObject {
        private static SingletonV3 instance = new SingletonV3();
    }

    private SingletonV3() {

    }

    public static SingletonV3 getInstance() {
        return SingletonObject.instance;
    }

    public void show() {
        System.out.println("singleton v3");
    }
}
