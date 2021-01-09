package automation.training.collections.motorcyclist.person;

import automation.training.collections.motorcyclist.ammunitions.Ammunition;

import java.util.ArrayList;
import java.util.Comparator;

public class Biker extends Person {
    private int yearOfExperience;
    private ArrayList<Ammunition> ammunition;

    public Biker(String name, int age, int yearOfExperience, ArrayList<Ammunition> ammunition) {
        super(name, age);
        this.yearOfExperience = yearOfExperience;
        this.ammunition = ammunition;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public ArrayList<Ammunition> getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(ArrayList<Ammunition> ammunition) {
        this.ammunition = ammunition;
    }

    public String sumOfPriceAmmunition() {
        int sum = 0;
        for (Ammunition ammunition : ammunition) {
            sum += ammunition.getPrice();
        }
        return "Sum of all ammunition " + sum + " $";
    }

    public void sortAmmunitionByWeight() {
        ammunition.sort(Comparator.comparingInt(Ammunition::getWeight));
    }

    public ArrayList<Ammunition> findAmmunitionByCost(int fromPrice, int toPrice) {
        ArrayList<Ammunition> foundAmmunition = new ArrayList<>();
        for (Ammunition ammunition : ammunition) {
            if (ammunition.getPrice() >= fromPrice
                    && ammunition.getPrice() <= toPrice)
                foundAmmunition.add(ammunition);
        }
        return foundAmmunition;
    }

    @Override
    public String toString() {
        return "Biker{" + super.toString() +
                "yearOfExperience=" + yearOfExperience +
                '}';
    }
}
