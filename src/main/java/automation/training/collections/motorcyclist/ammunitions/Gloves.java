package automation.training.collections.motorcyclist.ammunitions;

public class Gloves extends Ammunition {
    private String name;
    private String size;
    private boolean isLeather;

    public Gloves(int price, int weight, String name, String size, boolean isLeather) {
        super(price, weight);
        this.name = name;
        this.size = size;
        this.isLeather = isLeather;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isLeather() {
        return isLeather;
    }

    public void setLeather(boolean leather) {
        isLeather = leather;
    }

    @Override
    public String toString() {
        return "Gloves{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", isLeather=" + isLeather +
                '}';
    }
}
