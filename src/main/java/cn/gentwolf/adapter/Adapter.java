package cn.gentwolf.adapter;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        this.specificRequest();
    }
}

interface Target {
    void request();
}

class Adaptee {
    public void specificRequest() {

    }
}
