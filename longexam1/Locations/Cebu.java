package Locations;

import Tourists.Tourist;

public class Cebu implements Locations {

    public int airFare = 400;

    
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}