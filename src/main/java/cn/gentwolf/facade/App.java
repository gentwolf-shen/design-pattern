package cn.gentwolf.facade;

/**
 * 外观模式
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 * 定义了一个高层、统一的接口，外部与通过这个统一的接口对子系统中的一群接口进行访问
 * 通过创建一个统一的类，用来包装子系统中一个或多个复杂的类，客户端可以通过调用外观类的方法来调用内部子系统中所有方法
 */
public class App {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawRetangle();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
    }
}
