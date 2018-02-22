package a_foreach_method_in_iterable_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
Create By: Ron Rith
Create Date: 2/22/2018
*/
public class Java8ForEachExample {
    public static void main(String args[]){
        //creating sample Collection
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<10; i++) myList.add(i);

        //traversing using Iterator
        System.out.println("traversing using Iterator");
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }

        //traversing through forEach method of Iterable with anonymous class
        System.out.println("traversing through forEach method of Iterable with anonymous class");
        myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::"+t);
            }

        });

        //traversing with Consumer interface implementation
        System.out.println("traversing with Consumer interface implementation");
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::"+t);
    }


}
