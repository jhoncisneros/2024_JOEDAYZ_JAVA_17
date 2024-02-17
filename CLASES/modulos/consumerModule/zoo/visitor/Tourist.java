package zoo.visitor;

import java.util.*;

import dinos.zoo.tours.api.*;
import dinos.zoo.tours.reservations.*;

public class Tourist {
    
    public static void main(String[] args) {
        Tour tour = TourFinder.findSingleTour();
        System.out.println("Single tour " + tour);

        List<Tour> tours = TourFinder.findAllTour();
        System.out.println("# tours " + tours.size());
    }
}
