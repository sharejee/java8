package default_and_static_methods_in_interfaces;

/*
Create By: Ron Rith
Create Date: 2/22/2018
*/
public class MyClass implements Interface1,Interface2 {
    @Override
    public void method1(String str) {
        System.out.println("My class method1: "+str);
    }

    @Override
    public void log(String str) {
        /*System.out.println("MyClass logging::"+str);*/
       /* Interface1.print("abc");
       Interface1.super.log("Hello World!");
       Interface1.print("Hello World!");*/
    }

    @Override
    public void method2() {
        System.out.println("My class method2");
    }

    public static void main(String args[]){
        MyClass myClass = new MyClass();

        myClass.method1("Hello world!");

        myClass.method2();

        myClass.log("<<myClass>>");
    }
}
