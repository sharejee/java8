package version_lambda.without_lambda_expression;

/**
 * Created by : Ron Rith
 * Create Date: 02/25/2018.
 */
public interface Drawable {
    void draw();
}

class LambdaExpressionExample{
    public static void main(String args[]){
        Drawable drawable = new Drawable() {
            int width = 10;
            @Override
            public void draw() {
                System.out.println("Drawing: "+width);
            }
        };
        drawable.draw();
    }
}