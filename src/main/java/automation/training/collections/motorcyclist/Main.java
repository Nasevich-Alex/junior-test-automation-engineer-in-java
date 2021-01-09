package automation.training.collections.motorcyclist;

import automation.training.collections.motorcyclist.ammunitions.*;
import automation.training.collections.motorcyclist.person.Biker;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ammunition> ammunition = new ArrayList<>();
        ammunition.add(0, new Boots(50, 1500, "MegaBoots", "black", 43));
        ammunition.add(1, new Gloves(25, 300, "Tiger", "M", true));
        ammunition.add(2, new Helmet(45, 1000, false, "L"));
        ammunition.add(3, new Jacket(70, 1750, "M", "Turtle"));
        Biker biker = new Biker("Bob", 50, 15, ammunition);

        System.out.println(biker.sumOfPriceAmmunition());
        biker.sortAmmunitionByWeight();
        System.out.println(biker.findAmmunitionByCost(20, 55));
    }
}
