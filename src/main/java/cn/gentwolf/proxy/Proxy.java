package cn.gentwolf.proxy;

public class Proxy implements Subject {
    @Override
    public void buyMac() {
        RealSubject realSubject = new RealSubject();
        realSubject.buyMac();
    }
}


interface Subject {
    void buyMac();
}

class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("buy mac");
    }
}
