package functional_interfaces_and_lambda_expressions.lamda;

/*
Create By: Ron Rith
Create Date: 2/22/2018
*/
public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable d2=(s)->{
            System.out.println("Drawing "+width+"+s: "+s);
        };
        d2.draw("Hello");
    }
}
