package pe.joedayz.samples;

import java.util.ArrayList;
import java.util.Collections;

public class Product implements Comparable<Product>{

    private int id;
    private String name;

    public Product(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Product))
            return false;
        var other = (Product) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }

    public static void main(String[] args) {
        var products = new ArrayList<Product>();
//        products.add(new Product(null));
        products.add(new Product("Quack"));
        products.add(new Product("Puddles"));

        System.out.println(products);
        Collections.sort(products);
        System.out.println(products);

    }
}
