package version_lambda.foreach_loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by : Ron Rith
 * Create Date: 02/25/2018.
 */
public class TestForEach {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,3,24,5);
        list.forEach((n)->{
            System.out.println("Show n: "+n);
        });
        System.out.println("Iterator");
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            int v = integerIterator.next();
            System.out.println("Iterator: "+ v);
        }
    }
}
