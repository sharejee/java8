package version_method_references.contructor;


/**
 * Created by : Ron Rith
 * Create Date: 02/25/2018.
 */
public interface Messageable {
    Message getMessage(String msg);
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}
