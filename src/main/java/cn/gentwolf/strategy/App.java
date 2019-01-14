package cn.gentwolf.strategy;

/**
 * 策略模式
 * 定义一系列算法，将每个算法封装到具有公共接口的一系列策略类中，从而使它们可以相互替换, 且让算法可在不影响客户端的情况下发生变化
 */
public class App {
    public static void main(String[] args) {

        Context contextAdd = new Context(new StrategyAdd());
        System.out.println(contextAdd.execute(10, 20));

        Context contextSubstract = new Context(new StrategySubstract());
        System.out.println(contextSubstract.execute(20, 10));
    }
}
