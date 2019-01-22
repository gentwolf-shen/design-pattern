package cn.gentwolf.decorator;

/**
 * 装饰器模式
 * 对已经存在的某些类进行装饰，以此来扩展一些功能
 * 创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 */
public class App {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        System.out.printf("%s %f\n", coffee.name(), coffee.cost());

        Drink milkCoffee = new MilkCoffee(coffee);
        System.out.printf("%s %f\n", milkCoffee.name(), milkCoffee.cost());

        Drink sugarMilkCoffee = new SugarMilkCoffee(milkCoffee);
        System.out.printf("%s %f\n", sugarMilkCoffee.name(), sugarMilkCoffee.cost());
    }
}
