package java_stream_api_for_bulk_data_operations_on_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
Create By: Ron Rith
Create Date: 2/22/2018
*/
public class StreamExample {
    public static void main(String args[]){
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        //using lambda in forEach
        highNums.forEach(p -> System.out.println("High Nums parallel= "+p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential= "+p));
    }
}
