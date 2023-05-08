import Locations.*;
import Tourists.*;


public class App {
    public static void main(String[] args) throws Exception {

        Locations Boracay = new Boracay();
        Locations Antipolo = new Antipolo();
        Locations Bataan = new Bataan();
        Locations Bohol = new Bohol();
        Locations Cebu = new Cebu();
        Locations Pangasinan = new Pangasinan();

        Tourist Me = new Me();

        Boracay.accept(Me);
        Antipolo.accept(Me);
        Bataan.accept(Me);
        Bohol.accept(Me);
        Cebu.accept(Me);
        Pangasinan.accept(Me);



    }
}
