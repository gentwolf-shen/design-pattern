package cn.gentwolf.factory;

/**
 * 简单工厂:
 * 将“类实例化的操作”与“使用对象的操作”分开，让使用者不用知道具体参数就可以实例化出所需要的“产品”类，
 * 从而避免了在客户端代码中显式指定，实现了解耦。
 *
 * 抽抽象工厂:
 * 通过定义工厂父类负责定义创建对象的公共接口，而子类则负责生成具体的对象。
 * 将类的实例化延迟到工厂类的子类（具体工厂）中完成，即由子类来决定应该实例化（创建）哪一个类。
 */
public class App {
    public static void main(String[] args) {
        String[] products = {"productModelA", "productModelB"};

        for (String name : products) {
            SimpleFactory.getProduct(name).show();
        }

        FactoryA factoryA = new FactoryA();
        factoryA.Manufacture().show();
        factoryA.ManufactureSize().show();

        FactoryB factoryB = new FactoryB();
        factoryB.Manufacture().show();
        factoryA.ManufactureSize().show();
    }
}
