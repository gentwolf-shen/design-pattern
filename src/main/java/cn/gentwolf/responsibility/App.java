package cn.gentwolf.responsibility;


/**
 * 责任链模式 (职责链模式)
 * 为了避免请求发送者与多个请求处理者耦合在一起，
 * 将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；
 * 当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止
 *
 */
public class App {
    public static void main(String[] args) {
        Handle personA = new PersonA();
        Handle personB = new PersonB();
        Handle personC = new PersonC();

        personA.setNext(personB);
        personB.setNext(personC);

        personA.handleRequest(1);
        personA.handleRequest(7);
        personA.handleRequest(10);
        personA.handleRequest(20);
    }
}
