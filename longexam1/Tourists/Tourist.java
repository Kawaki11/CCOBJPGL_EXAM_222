package Tourists;

import Locations.Boracay;
import Locations.Locations;
import Locations.Antipolo;
import Locations.Bataan;
import Locations.Bohol;
import Locations.Cebu;
import Locations.Pangasinan;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

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
