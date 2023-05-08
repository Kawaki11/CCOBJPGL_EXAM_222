package Locations;

import Tourists.Tourist;

public class Bohol implements Locations {

    public int airFare = 500;

    
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}