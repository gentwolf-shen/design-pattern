package cn.gentwolf.prototype;

import java.util.Date;

public class Prototype {
}

class Sheep implements Cloneable {
    private String name;
    private Date birthday;
    private Lab lab;


    public Sheep(String name, Date birthday, Lab lab) {
        this.name = name;
        this.birthday = birthday;
        this.lab = lab;
    }

    /**
     * 浅复制
     * @param sheep
     */
    public Sheep(Sheep sheep) {
        this.name = sheep.getName();
        this.birthday = sheep.getBirthday();
        this.lab = sheep.getLab();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Lab getLab() {
        return lab;
    }

    public void setLab(Lab lab) {
        this.lab = lab;
    }

    /**
     * 浅复制
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Lab implements Cloneable {
    private String name;
    private String address;

    public Lab(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
