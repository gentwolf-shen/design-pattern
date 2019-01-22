package cn.gentwolf.decorator;

// step 1: 定义接口
interface Drink{
    float cost();
    String name();
}

// step 2: 具体实体类
class Coffee implements Drink {
    @Override
    public float cost() {
        return 10;
    }

    @Override
    public String name() {
        return "Coffee";
    }
}

// step 3: 抽象装饰类
public abstract class Decorator implements Drink {
    protected Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return this.drink.cost();
    }

    @Override
    public String name() {
        return this.drink.name();
    }
}

// step 4-1: 具体实现类
class MilkCoffee extends Decorator {
    public MilkCoffee(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 2;
    }

    @Override
    public String name() {
        return super.name() + " Milk";
    }
}

// step 4-1: 具体实现类
class SugarMilkCoffee extends Decorator {
    public SugarMilkCoffee(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 1;
    }

    @Override
    public String name() {
        return super.name() + " Sugar";
    }
}