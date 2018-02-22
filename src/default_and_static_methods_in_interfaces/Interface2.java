package default_and_static_methods_in_interfaces;

/*
Create By: Ron Rith
Create Date: 2/22/2018
*/
@FunctionalInterface
public interface Interface2 {

    void method2();

    default void log(String str) {
        System.out.println("I2 Logging : " + str);
    }
}
