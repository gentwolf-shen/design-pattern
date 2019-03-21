package cn.gentwolf.state;

public interface State {
    void doAction(Context context);
}

class StartState implements State {
    public void doAction(Context context) {
        System.out.println("start state");
        context.setState(this);
    }

    public String toString() {
        return "StartState";
    }
}

class StopState implements State {
    public void doAction(Context context) {
        System.out.println("stop state");
        context.setState(this);
    }

    public String toString() {
        return "StopState";
    }
}