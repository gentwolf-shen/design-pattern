package cn.gentwolf.strategy;

public interface Strategy {
    int execute(int a, int b);
}

class StrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

class StrategySubstract implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}


class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int a, int b) {
        return this.strategy.execute(a, b);
    }
}