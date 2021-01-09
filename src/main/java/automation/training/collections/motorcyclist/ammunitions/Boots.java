package automation.training.collections.motorcyclist.ammunitions;

public class Boots extends Ammunition{
    private String name;
    private String colour;
    private int size;

    public Boots(int price, int weight, String name, String colour, int size) {
        super(price, weight);
        this.name = name;
        this.colour = colour;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Boots{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
