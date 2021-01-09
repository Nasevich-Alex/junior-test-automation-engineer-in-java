package automation.training.collections.motorcyclist.ammunitions;

public class Ammunition {
    private int price;
    private int weight;

    public Ammunition(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Price: " + price + ". Weight: " + weight + ".";
    }
}
