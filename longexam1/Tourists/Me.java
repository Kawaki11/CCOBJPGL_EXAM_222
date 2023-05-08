package Tourists;


import Locations.*;

public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("ang budget ko ay " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("lezggg Boracay" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("omai ala budget");
        }

      checkBudget();
        
    }

    public void visit(Antipolo antipolo) {

        if(budget >antipolo.airFare){
            System.out.println("kaya pa sa Antipolo");
            budget -= antipolo.airFare;
        }else{
            System.out.println("awit hindi pala kaya");
        }

        checkBudget();
    }
    public void visit(Bataan bataan) {
        if(budget >bataan.airFare){
            System.out.println("tara naman sa Bataan lezgo");
            budget -= bataan.airFare;
        }else{
            System.out.println("hindi na kaya sir");
        }

        checkBudget();
    }

    public void visit(Bohol bohol) {
        if(budget >bohol.airFare){
            System.out.println("rarara Bohol namans");
            budget -= bohol.airFare;
        }else{
            System.out.println("omai ala na pera");
        }

        checkBudget();
    }

    public void visit(Cebu cebu) {
        if(budget >cebu.airFare){
            System.out.println("Cebu na mga sir lezgggg");
            budget -= cebu.airFare;
        }else{
            System.out.println("ala na pala budget omai");
        }

        checkBudget();
    }

    public void visit(Pangasinan pangasinan) {
        if(budget >pangasinan.airFare){
            System.out.println("Pangasinan lezgooooo");
            budget -= pangasinan.airFare;
        }else{
            System.out.println("awit lods ala na budget");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}
