package automation.training.collections.motorcyclist.ammunitions;

public class Jacket extends Ammunition {
    private String size;
    private String model;

    public Jacket(int price, int weight, String size, String model) {
        super(price, weight);
        this.size = size;
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "size='" + size + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}