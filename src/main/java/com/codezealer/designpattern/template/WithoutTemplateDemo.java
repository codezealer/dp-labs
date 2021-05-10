package com.codezealer.designpattern.template;

/**
 * 不用模板方法
 * 每次修改公共逻辑的时候，需要修改多个地方，造成耦合
 * 当然可以把公共逻辑抽取到一个方法里面去，但是这样子引用这个方法的地方还是有多处
 * 如果方法本身调用方式改动了的话，也会造成需要进行多个地方修改
 */
public class WithoutTemplateDemo {

    public static void main(String[] args) {
        Calculator cal1 = new Calculator1();
        Calculator cal2 = new Calculator2();

        cal1.calculate();
        cal2.calculate();
    }

    public interface Calculator {
        void calculate();
    }

    public static class Calculator1 implements Calculator {

        @Override
        public void calculate() {
            System.out.println("计算通用逻辑");
            System.out.println("计算专门的逻辑1111");
        }
    }

    public static class Calculator2 implements Calculator {

        @Override
        public void calculate() {
            System.out.println("计算通用逻辑");
            System.out.println("计算专门的逻辑2222");
        }
    }

}
