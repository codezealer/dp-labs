package com.codezealer.designpattern.factory;

/**
 * 因为实际的Product实现类是可能会变动的，比如说Product1变成了Product2
 * 这个时候所有new Product1的地方就需要金雄修改
 * 造成代码耦合
 */
public class WithoutSimpleFactoryDemo {

    public static void main(String[] args) {
        Product product1 = new Product1();

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

}
