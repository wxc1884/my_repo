package com.chd.interfac;
interface A{
    void run();
}
interface B extends A{

}
class C implements A{

    @Override
    public void run() {
        System.out.println("hello");
    }
}

public class test {
    public static void main(String[] args) {
        A b=new C();
        b.run();
    }
}
