package version_method_references.instance_method;

/**
 * Created by : Ron Rith
 * Create Date: 02/25/2018.
 */
public interface Sayable {
    void say();
}

class SayTest{
    public void SayHello(){
        System.out.println("Say Hello World Instance!");
    }
    public static void main(String args[]){
        SayTest sayable = new SayTest();
        Sayable sayable1 = sayable::SayHello;
        sayable1.say();
    }
}
