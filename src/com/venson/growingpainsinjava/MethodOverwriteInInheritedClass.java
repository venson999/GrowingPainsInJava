package com.venson.growingpainsinjava;

public class MethodOverwriteInInheritedClass {

    @SuppressWarnings("static-access")
    public static void main(String[] args) {

        System.out.println("1:");
        Parent p = new Parent();
        p.invokePrint();
        p.invokeStaticPrint();

        System.out.println("2:");
        Child c = new Child();
        c.invokePrint();
        c.invokeStaticPrint();

        System.out.println("3:");
        p = c;
        p.invokePrint();
        p.invokeStaticPrint();
    }
}

class Parent {

    protected String pStr;

    public Parent() {
        invokePrint();
        pStr = "parent";
    }

    protected void invokePrint() {
        System.out.println("pStr = " + pStr);
    }

    static void invokeStaticPrint() {
        System.out.println("parent static");
    }
}

class Child extends Parent {

    protected String cStr;

    public Child() {
        super();
        cStr = "child";
    }

    protected void invokePrint() {
        System.out.println("pStr = " + pStr);
        System.out.println("cStr = " + cStr);
    }

    static void invokeStaticPrint() {
        System.out.println("Child static");
    }
}
