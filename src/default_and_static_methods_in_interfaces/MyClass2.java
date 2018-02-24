package default_and_static_methods_in_interfaces;

/*
Create By: Ron Rith
Create Date: 2/24/2018
*/
public class MyClass2 implements Interface1 {
    @Override
    public void method1(String str) {

    }
    @Override
    public void log(String str) {
        Interface1.super.log(str);
    }

    public static void main(String args[]){
        MyClass2 myClass2 = new MyClass2();
        myClass2.log("<<Hello>>");
    }
}
