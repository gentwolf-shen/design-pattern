package cn.gentwolf.proxy;

/**
 * 代理模式: 静态代理
 * 给目标对象提供一个代理对象,并由代理对象控制对目标对象的引用,起到中介作用,连接客户端和目标对象
 */
public class App {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.buyMac();
    }
}
