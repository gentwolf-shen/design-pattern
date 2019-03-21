package cn.gentwolf.state;

public class Context {
    private State state;

    public Context() {

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
