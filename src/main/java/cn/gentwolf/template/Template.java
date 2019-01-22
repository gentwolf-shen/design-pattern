package cn.gentwolf.template;

public class Template {}

abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        this.initialize();
        this.startPlay();
        this.endPlay();
    }
}

class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket.initialize()");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket.startPlay()");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket.endPlay()");
    }
}

class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football.initialize()");
    }

    @Override
    public void startPlay() {
        System.out.println("Football.startPlay()");
    }

    @Override
    public void endPlay() {
        System.out.println("Football.endPlay()");
    }
}
