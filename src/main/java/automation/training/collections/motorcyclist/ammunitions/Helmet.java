package automation.training.collections.motorcyclist.ammunitions;

public class Helmet extends Ammunition {
    private boolean isOpenKind;
    private String size;

    public Helmet(int price, int weight, boolean isOpenKind, String size) {
        super(price, weight);
        this.isOpenKind = isOpenKind;
        this.size = size;
    }

    public boolean isOpenKind() {
        return isOpenKind;
    }

    public void setOpenKind(boolean openKind) {
        isOpenKind = openKind;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "isOpenKind=" + isOpenKind +
                ", size='" + size + '\'' +
                '}';
    }
}
