package ua.goit.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 7 on 18.03.2016.
 */

abstract class Instrument {
    public abstract String getType();

    public String toString() {
        return getType();
    }
}

class Guitar extends Instrument {
    public String getType() {
        return "guitar";
    }
}

class Piano extends Instrument{
    public String getType() {
        return "piano";
    }
}

class Trumpet extends Instrument {
    public String getType() {
        return "trumpet";
    }
}

class InstrumentalShop {
    int pianos;
    int guitars;
    int trumpets;

    public int getGuitars() {
        return guitars;
    }

    public void setGuitars(int guitars) {
        this.guitars = guitars;
    }

    public int getPianos() {
        return pianos;
    }

    public void setPianos(int pianos) {
        this.pianos = pianos;
    }

    public int getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(int trumpets) {
        this.trumpets = trumpets;
    }

    public String toString() {
        return "There is: "
                +pianos+" pianos, "
                +guitars+" guitars and "
                +trumpets+" trumpets in the instrumental shop.";
    }
}

public class TheNumberOfMusicalInstruments {
    public static void main(String[] args) {
        InstrumentalShop shop = new InstrumentalShop();

        shop.setPianos(2);
        shop.setGuitars(16);
        shop.setTrumpets(7);

        System.out.println(shop);
        System.out.println();

        String CountOforder;

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                CountOforder = "First order: 7 guitars and 2 trumpets.";
                System.out.println(CountOforder);

                int numberOfPianosToRemove = 0;
                int numberOfGuitarsToRemove = 7;
                int numberOfTrumpetsToRemove = 2;

                try {
                    if (numberOfPianosToRemove < shop.getPianos()
                            && numberOfGuitarsToRemove < shop.getGuitars()
                            && numberOfTrumpetsToRemove < shop.getTrumpets())
                    {
                        shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
                        shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
                        shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

                        System.out.println("Order is done");
                        System.out.println();
                        System.out.println(shop);
                        System.out.println();
                    } else throw new IllegalStateException();
                } catch (IllegalStateException ex) {
                    System.out.println("Order hasn't done! Not enough instruments in the shop");
                }

            }

            if (i == 1) {
                CountOforder = "Second order : 1 piano.";
                System.out.println(CountOforder);

                int numberOfPianosToRemove = 1;
                int numberOfGuitarsToRemove = 0;
                int numberOfTrumpetsToRemove = 0;

                try {
                    if (numberOfPianosToRemove < shop.getPianos()
                            && numberOfGuitarsToRemove < shop.getGuitars()
                            && numberOfTrumpetsToRemove < shop.getTrumpets())
                    {
                        shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
                        shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
                        shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

                        System.out.println("Second order is done");
                        System.out.println();
                        System.out.println(shop);
                        System.out.println();
                    } else throw new IllegalStateException();
                } catch (IllegalStateException ex) {
                    System.out.println("Order hasn't done! Not enough instruments in the shop");
                }
            }

            if (i == 2) {
                CountOforder = "Third order : 1 piano, 8 guitars and 6 trumpets.";
                System.out.println(CountOforder);

                int numberOfPianosToRemove = 1;
                int numberOfGuitarsToRemove = 8;
                int numberOfTrumpetsToRemove = 6;

                try {
                    if (numberOfPianosToRemove < shop.getPianos()
                            && numberOfGuitarsToRemove < shop.getGuitars()
                            && numberOfTrumpetsToRemove < shop.getTrumpets())
                    {
                        shop.setPianos(shop.getPianos() - numberOfPianosToRemove);
                        shop.setGuitars(shop.getGuitars() - numberOfGuitarsToRemove);
                        shop.setTrumpets(shop.getTrumpets() - numberOfTrumpetsToRemove);

                        System.out.println("Third order is done");
                        System.out.println();
                        System.out.println(shop);
                        System.out.println();
                    } else throw new IllegalStateException();
                } catch (IllegalStateException ex) {
                    System.out.println("Order hasn't done! Not enough instruments in the shop");
                }
            }

        }
        System.out.println();
        System.out.println(shop);
    }
}
