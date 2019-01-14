package cn.gentwolf.factory;

public abstract class AbstractFactory {
    public abstract ProductModel Manufacture();
    public abstract ProductSize ManufactureSize();
}

class FactoryA extends AbstractFactory {
    public ProductModel Manufacture() {
        return new ProductModelA();
    }

    public ProductSize ManufactureSize() {
        return new ProductSizeA();
    }
}

class FactoryB extends AbstractFactory {
    public ProductModel Manufacture() {
        return new ProductModelB();
    }
    public ProductSize ManufactureSize() {
        return new ProductSizeA();
    }
}