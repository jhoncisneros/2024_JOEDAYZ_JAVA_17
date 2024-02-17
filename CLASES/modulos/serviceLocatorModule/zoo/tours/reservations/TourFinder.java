package zoo.tours.reservations;

import java.util.*;

import dinos.zoo.tours.api.*;

public class TourFinder {

    public static Tour findSingleTour(){
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for(Tour tour: loader){
            return tour;        
        }
        return null;
    }

    public static List<Tour> findAllTour(){
        List<Tour> tours = new ArrayList<>();
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for(Tour tour: loader){
            tours.add(tour);
        }
        return tours;
    }

}
