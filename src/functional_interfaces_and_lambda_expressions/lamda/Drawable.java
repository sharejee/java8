package functional_interfaces_and_lambda_expressions.lamda;

/*
Create By: Ron Rith
Create Date: 2/22/2018
*/
@FunctionalInterface
public interface Drawable {
    void draw(String s);

    default String draw2(String s){
        return s;
    }

    static void Hello(){
        System.out.println("Hello");
    }
}
