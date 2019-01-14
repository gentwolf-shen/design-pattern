package cn.gentwolf.factory;

public abstract class ProductSize {
    public abstract void show();
}

class ProductSizeA extends ProductSize {
    public void show() {
        System.out.println("ProductSizeA");
    }
}

class ProductSizeB extends ProductSize {
    public void show() {
        System.out.println("ProductSizeB");
    }
}