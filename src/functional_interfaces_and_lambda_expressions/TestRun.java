package functional_interfaces_and_lambda_expressions;

/*
Create By: Ron Rith
Create Date: 2/22/2018
*/
public class TestRun {
    public static void main(String args[]) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello runnable");
            }
        };
        runnable.run();

        Runnable runnable1 = () -> {
            System.out.println("Hello runnable1");
        };
        runnable1.run();
    }
}


