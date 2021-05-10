package com.codezealer.designpattern.factory;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        Product product1 = Product1Factory.get().createProduct();
        Product product2 = Product2Factory.get().createProduct();

        product1.execute();
        product2.execute();
    }

    public interface Product {
        void execute();
    }

    public static class Product1 implements Product {

        @Override
        public void execute() {
            System.out.println("产品1执行方法");
        }
    }

    public static class Product2 implements Product {

        @Override
        public void execute() {
            System.out.println("产品2执行方法");
        }
    }

    public interface ProductFactory {
        public Product createProduct();
    }

    public static abstract class AbstractProductFactory implements ProductFactory {

        @Override
        public Product createProduct() {
            System.out.println("公共的创建商品逻辑..");
            return specificProduct();
        }

        public abstract Product specificProduct();
    }

    public static class Product1Factory extends AbstractProductFactory {

        private static ProductFactory instance = new Product1Factory();

        private Product1Factory() {

        }

        public static ProductFactory get() {
            return instance;
        }

        @Override
        public Product specificProduct() {
            return new Product1();
        }
    }

    public static class Product2Factory extends AbstractProductFactory {

        private static ProductFactory instance = new Product2Factory();

        private Product2Factory() {

        }

        public static ProductFactory get() {
            return instance;
        }

        @Override
        public Product specificProduct() {
            return new Product2();
        }
    }
}
