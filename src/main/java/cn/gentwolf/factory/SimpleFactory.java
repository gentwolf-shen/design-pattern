package cn.gentwolf.factory;

public class SimpleFactory {
    public static ProductModel getProduct(String productName) {
        ProductModel product = null;
        switch (productName) {
            case "productModelA":
                product = new ProductModelA();
                break;

            case "productModelB":
                product = new ProductModelB();
                break;
        }

        return product;
    }
}

