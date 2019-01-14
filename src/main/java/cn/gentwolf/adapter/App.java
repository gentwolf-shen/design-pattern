package cn.gentwolf.adapter;

/**
 * 适配器模式
 * 将一个类的接口转换成客户希望的另外一个接口, 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作
 */
public class App {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.request();
    }
}
