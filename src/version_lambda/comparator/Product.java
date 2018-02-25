package version_lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by : Ron Rith
 * Create Date: 02/25/2018.
 */
public class Product {
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

class LambdaExpressionExample10{
    public static void main(String args[]){
        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        System.out.println("Sorting on the basis of name...");

        // implementing lambda expression
        Collections.sort(list,(p1, p2)->{
            return p1.name.compareTo(p2.name);
        });
        for(Product p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
        // using lambda to filter data
        System.out.println("using lambda to filter data ");
        Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );
    }
}
