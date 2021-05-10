package com.codezealer.designpattern.factory;

/**
 * 每次调整产品组合的时候，调用方都需要修改
 */
public class WithoutAbstractFactoryDemo {

    public static void main(String[] args) {
//        ProductA firstProductA = ProductA1Factory.createProduct();
//        ProductB firstProductB = ProductB1Factory.createProduct();
//        firstProductA.execute();
//        firstProductB.execute();

        ProductA secondProductA = ProductA2Factory.createProduct();
        ProductB secondProductB = ProductB2Factory.createProduct();
        secondProductA.execute();
        secondProductB.execute();

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

    static class ProductA1Factory {
        static public ProductA createProduct() {
            return new ProductA1();
        }
    }

    static class ProductA2Factory {
        static public ProductA createProduct() {
            return new ProductA2();
        }
    }

    static class ProductB1Factory {
        static public ProductB createProduct() {
            return new ProductB1();
        }
    }

    static class ProductB2Factory {
        static public ProductB createProduct() {
            return new ProductB2();
        }
    }
}
