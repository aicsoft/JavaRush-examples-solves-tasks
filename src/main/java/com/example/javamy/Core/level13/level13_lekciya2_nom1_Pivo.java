package com.example.javamy.Core.level13;

public class level13_lekciya2_nom1_Pivo {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {
       public void sleepOnTheFloor(){}
        public void askForMore(String message) {

        }

         public void sayThankYou() {

        }

        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

          }
}



