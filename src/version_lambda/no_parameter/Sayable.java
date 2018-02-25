package version_lambda.no_parameter;

/**
 * Created by : Ron Rith
 * Create Date: 02/25/2018.
 */
public interface Sayable {
    void say();
}
class LambdaExample{
    public static void main(String args[]){
        Sayable sayable = () ->{
            System.out.println("Say Hello world lambda no parameter");
        };
        sayable.say();
    }
}
