package cn.gentwolf.prototype;

import java.util.Date;

/**
 * 原型模式
 * 用于创建重复的对象, 同时又能保证性能, 当直接创建对象的代价比较大时，则采用这种模式
 *
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Lab lab = new Lab("a", "address form a");

        Sheep sheep1 = new Sheep("Sheep a", new Date(), lab);

        Sheep sheep2 = (Sheep)sheep1.clone();
        sheep2.setName("sheep b");
        sheep2.setBirthday(new Date(System.currentTimeMillis() + 86400000));
        sheep2.getLab().setName("b");
        sheep2.getLab().setAddress("address for b");

        Sheep sheep3 = new Sheep(sheep1);
        sheep3.setName("sheep c");
        sheep3.setBirthday(new Date(System.currentTimeMillis() + 86400000 * 2));



        System.out.printf("%s, %s (%s, %s) \n", sheep1.getName(), sheep1.getBirthday(), sheep1.getLab().getName(), sheep1.getLab().getAddress());
        System.out.printf("%s, %s (%s, %s) \n", sheep2.getName(), sheep2.getBirthday(), sheep2.getLab().getName(), sheep2.getLab().getAddress());
        System.out.printf("%s, %s (%s, %s) \n", sheep3.getName(), sheep3.getBirthday(), sheep3.getLab().getName(), sheep3.getLab().getAddress());

    }
}
