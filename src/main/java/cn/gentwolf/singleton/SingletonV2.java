package cn.gentwolf.singleton;

public enum SingletonV2 {
    INSTANCE;

    public static SingletonV2 getInstance() {
        return INSTANCE;
    }

    public void show() {
        System.out.println("singleton v2");
    }
}
