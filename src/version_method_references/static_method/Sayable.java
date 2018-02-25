package version_method_references.static_method;

/**
 * Created by : Ron Rith
 * Create Date: 02/25/2018.
 */
public interface Sayable {
    void say();
}

class SayTest{
    public static void SayHello(){
        System.out.println("Say Hello World!");
    }
    public static void main(String args[]){
        Sayable sayable = SayTest::SayHello;
        sayable.say();
        Thread t2=new Thread(SayTest::SayHello);
        t2.start();
    }
}
