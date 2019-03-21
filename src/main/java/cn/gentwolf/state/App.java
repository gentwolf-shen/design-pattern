package cn.gentwolf.state;

/**
 * 状态模式
 * 当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。
 * 类的行为是基于它的状态改变的, 对象的行为依赖于它的状态（属性），并且可以根据它的状态改变而改变它的相关行为。
 *
 */
public class App {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
