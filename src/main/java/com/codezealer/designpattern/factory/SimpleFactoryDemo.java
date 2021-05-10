package com.codezealer.designpattern.factory;

/**
 * 简单工厂方法就是将new Product抽取一层出来而已，需要修改实现的话，在工厂里面进行修改即可
 */
public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct();
        product1.execute();
    }

    public interface Product {
        void execute();
    }

    public static class Product1 implements Product {

        @Override
        public void execute() {
            System.out.println("产品1.。。。。");
        }
    }

    public static class ProductFactory {
        public static Product createProduct() {
            return new Product1();
        }
    }

}
