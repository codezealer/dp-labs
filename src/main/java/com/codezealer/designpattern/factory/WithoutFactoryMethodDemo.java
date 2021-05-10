package com.codezealer.designpattern.factory;

/**
 * 存在的问题，就是有创建产品的公共逻辑，现在有两个地方
 * 我们想办法把他抽取到一个地方，用模板方法的方式
 */
public class WithoutFactoryMethodDemo {

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
            System.out.println("产品1执行方法修改");
        }
    }

    public static class Product2 implements Product {

        @Override
        public void execute() {
            System.out.println("产品2执行方法修改");
        }
    }

    public interface ProductFactory {
        Product createProduct();
    }

    public static class Product1Factory implements ProductFactory {

        static ProductFactory  instance = new Product1Factory();

        private Product1Factory() {

        }

        public static ProductFactory get() {
            return instance;
        }

        public Product createProduct() {
            System.out.println("公用的创建商品逻辑");
            return new Product1();
        }
    }

    public static class Product2Factory implements ProductFactory {

        static ProductFactory instance = new Product2Factory();

        private Product2Factory() {

        }

        public static ProductFactory get() {
            return instance;
        }

        public Product createProduct() {
            System.out.println("公用的创建商品逻辑");
            return new Product2();
        }
    }


}
