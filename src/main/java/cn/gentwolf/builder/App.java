package cn.gentwolf.builder;

/**
 * 每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者，
 * 用户使用不同的具体建造者即可得到不同的产品对象。
 */
public class App {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.construct(builder);
        Computer computer = builder.getComputer();
        computer.show();
    }
}
