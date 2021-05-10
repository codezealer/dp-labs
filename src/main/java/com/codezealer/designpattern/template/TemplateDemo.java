package com.codezealer.designpattern.template;

/**
 * 模板方法，把公共的方法抽取到父类中，这样子代码就只有一处，
 * 所以修改公共方法的时候，只需要修改一个地方
 */
public class TemplateDemo {

    public static void main(String[] args) {
        Calculator cal1 = new Calculator1();
        Calculator cal2 = new Calculator2();

        cal1.calculate();
        cal2.calculate();
    }

    public interface Calculator {
        void calculate();
    }

    public static abstract class AbstractCalculator implements Calculator {
        public abstract void specifyCalculate();
        @Override
        public void calculate() {
            System.out.println("计算通用逻辑");
            this.specifyCalculate();
        }
    }

    public static class Calculator1 extends AbstractCalculator {

        @Override
        public void specifyCalculate() {
            System.out.println("计算专门的逻辑1111");
        }
    }

    public static class Calculator2 extends AbstractCalculator  {
        @Override
        public void specifyCalculate() {
            System.out.println("计算专门的逻辑2222");
        }
    }
}
