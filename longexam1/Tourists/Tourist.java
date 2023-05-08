package Tourists;

import Locations.Aklan;
import Locations.Locations;
import Locations.Antipolo;
import Locations.Bataan;
import Locations.Bohol;
import Locations.Cebu;
import Locations.Pangasinan;

public interface Tourist {

    int budget = 2000;

    void visit();

    void visit(Aklan aklan);

    void visit(Antipolo antipolo);
    
    void visit(Bataan bataan);

    void visit(Bohol bohol);

    void visit(Cebu cebu);

    void visit(Pangsinan pangasinan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}