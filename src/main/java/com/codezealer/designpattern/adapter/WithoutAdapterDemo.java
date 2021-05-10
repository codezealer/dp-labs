package com.codezealer.designpattern.adapter;


public class WithoutAdapterDemo {

    public static void main(String[] args) {
        InterfaceV1 interfaceV1 = new InterfaceV1();
        InterfaceV2 interfaceV2 = new InterfaceV2();

        interfaceV1.sayHi();
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



}
