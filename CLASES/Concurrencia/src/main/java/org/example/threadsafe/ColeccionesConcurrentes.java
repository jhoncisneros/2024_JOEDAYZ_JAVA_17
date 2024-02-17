package org.example.threadsafe;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ColeccionesConcurrentes {

    public static void main(String[] args) {
        //ERROR AL EJECUTAR
//        var foodData = new HashMap<String, Integer>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//
//        for(String key: foodData.keySet()){
//            foodData.remove(key);
//        }

//        var foodData = new ConcurrentHashMap<String, Integer>();
//        foodData.put("penguin", 1);
//        foodData.put("flamingo", 2);
//
//        for(String key: foodData.keySet()){
//            foodData.remove(key);
//        }

        List<String> birds = new CopyOnWriteArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        birds.add("hawk");

        for (String s: birds){
            birds.remove(s);
        }
        System.out.println(birds.size()); // 0

        // ERROR - UnsupportedOperationException
//        var iterator = birds.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//        }
//        System.out.println(birds.size());
    }
}
