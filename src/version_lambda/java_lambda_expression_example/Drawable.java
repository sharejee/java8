package version_lambda.java_lambda_expression_example;

/**
 * Created by : Ron Rith
 * Create Date: 02/25/2018.
 */
public interface Drawable {
    void draw();
}

class LambdaExpressionExample{
    public static void main(String args[]){
        int width = 10;
        Drawable drawable = ()->{
            System.out.println("Drawing: "+width);
        };
        drawable.draw();
    }

}