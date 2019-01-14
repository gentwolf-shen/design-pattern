package cn.gentwolf.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class Builder {
    public abstract void buildCpu();
    public abstract void buildMainboard();
    public abstract void buildHardDisk();

    public abstract Computer getComputer();
}

class Computer {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        this.parts.add(part);
    }

    public void show() {
        for (String part : this.parts) {
            System.out.printf("part %s\n", part);
        }
        System.out.println("done");
    }
}

class ConcreteBuilder extends Builder {
    private Computer computer = new Computer();

    public void buildCpu() {
        this.computer.add("build CPU");
    }

    public void buildMainboard() {
        this.computer.add("build mainboard");
    }

    public void buildHardDisk() {
        this.computer.add("build hard disk");
    }

    public Computer getComputer() {
        return this.computer;
    }
}

class Director {
    public void construct(Builder builder) {
        builder.buildCpu();
        builder.buildHardDisk();
        builder.buildMainboard();
    }
}