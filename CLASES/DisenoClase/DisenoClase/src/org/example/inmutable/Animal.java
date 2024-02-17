package org.example.inmutable;

import java.util.ArrayList;
import java.util.List;

public final class Animal {

    private final ArrayList<String> favoriteFoods;
//    private final String favorite;

    public Animal(){
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
//        this.favorite = "favorite";
    }

//    public Animal(ArrayList<String> favoriteFoods){
//        if(favoriteFoods == null || favoriteFoods.size() == 0)
//            throw new RuntimeException("favoriteFoods is required");
//        this.favoriteFoods = favoriteFoods;
//    }

    public Animal(ArrayList<String> favoriteFoods){
        if(favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

//    public List<String> getFavoriteFoods(){
//        return favoriteFoods;
//    }

    public int getFavoriteFoodsCount(){
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index){
        return favoriteFoods.get(index);
    }

    public List<String> getFavoriteFoods(){
        return new ArrayList<String>(this.favoriteFoods);
    }

//    public String getFavorite(){
//        return favorite;
//    }
}

class Main{

    public static void main(String[] args) {
        var zebra = new Animal();
        System.out.println(zebra.getFavoriteFoodsCount());
        System.out.println(zebra.getFavoriteFoodsItem(0));

        System.out.println(zebra.getFavoriteFoods());
//        System.out.println(zebra.getFavorite());

        zebra.getFavoriteFoods().clear();
        zebra.getFavoriteFoods().add("Chocoloate Chip cookies");
        System.out.println(zebra.getFavoriteFoods());

//        zebra.getFavorite().concat(zebra.getFavorite() + " aaaa");
//        System.out.println(zebra.getFavorite());

        System.out.println("##############");

        var favorites = new ArrayList<String>();
        favorites.add("Manzana");

        var zebra2 = new Animal(favorites);
        System.out.println(zebra2.getFavoriteFoodsCount());
        System.out.println(zebra2.getFavoriteFoodsItem(0));

        System.out.println(zebra2.getFavoriteFoods());

        favorites.clear();
        favorites.add("Chocoloate Chip cookies");
        System.out.println(zebra2.getFavoriteFoodsItem(0));
        System.out.println(zebra2.getFavoriteFoods());

    }
}
