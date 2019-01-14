package cn.gentwolf.factory;

public abstract class ProductModel {
    public abstract void show();
}

class ProductModelA extends ProductModel {
    public void show() {
        System.out.println("ProductModelA");
    }
}

class ProductModelB extends ProductModel {
    public void show() {
        System.out.println("ProductModelB");
    }
}
