package com.codezealer.designpattern.adapter;

public class AdapterDemo {

    public static void main(String[] args) {
        InterfaceAdapter adapter = new InterfaceAdapter();
        InterfaceV2 interfaceV2 = new InterfaceV2();

        adapter.sayHello();
        interfaceV2.sayHello();
    }

    public static class InterfaceV1{

        public void sayHi() {
            System.out.println("version1 ....");
        }
    }

    public static class InterfaceV2  {

        public void sayHello () {
            System.out.println("version2 ....");
        }
    }

    public static class InterfaceAdapter {
        InterfaceV1 interfaceV1 = new InterfaceV1();

        public void sayHello() {
            interfaceV1.sayHi();
        }
    }

}
