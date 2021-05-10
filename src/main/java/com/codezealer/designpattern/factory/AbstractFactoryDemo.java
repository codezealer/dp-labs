package com.codezealer.designpattern.factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        //如果要更改A1+B1的组合为 A1+B2，直接改createProduct方法即可
        ProductA firstProductA = ProductFactory1.get().createProductA();
        ProductB firstProductB = ProductFactory1.get().createProductB();
        firstProductA.execute();
        firstProductB.execute();



    }


    interface ProductA {
        void execute();
    }

    interface ProductB {
        void execute();
    }

    static class ProductA1 implements ProductA {

        @Override
        public void execute() {
            System.out.println("A1 execute");
        }
    }

    static class ProductA2 implements ProductA {

        @Override
        public void execute() {
            System.out.println("A2 execute");
        }
    }

    static class ProductB1 implements ProductB {

        @Override
        public void execute() {
            System.out.println("B1 execute");
        }
    }

    static class ProductB2 implements ProductB {

        @Override
        public void execute() {
            System.out.println("B2 execute");
        }
    }

    public interface AbstractFactory {
        public ProductA createProductA();
        public ProductB createProductB();

    }

    static class ProductFactory1 implements AbstractFactory {
        private static final ProductFactory1 instance = new ProductFactory1();

        public static ProductFactory1 get() {
            return instance;
        }

        @Override
        public ProductA createProductA() {
            return new ProductA1();
        }

        @Override
        public ProductB createProductB() {
            return new ProductB2();
        }
    }

}
