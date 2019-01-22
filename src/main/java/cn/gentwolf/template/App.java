package cn.gentwolf.template;

/**
 * 模板模式
 * 定义一个模板结构，将具体内容延迟到子类去实现
 * 将相同部分的代码放在抽象的父类中，而将不同的代码放入不同的子类中
 * 通过一个父类调用其子类的操作，通过对子类的具体实现扩展不同的行为，实现了反向控制 & 符合“开闭原则”
 */
public class App {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.play();

        Football football = new Football();
        football.play();
    }
}
