package automation.training.classes;

public class Car {
    int id;
    BrandOfCars brand;
    String model;
    int yearOfIssue;
    String colour;
    int price;
    int regNumber;

    public Car(BrandOfCars brand, String model, int yearOfIssue, int price) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
    }

    public Car(int id, BrandOfCars brand, String model, int yearOfIssue, String colour, int price, int regNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.colour = colour;
        this.price = price;
        this.regNumber = regNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BrandOfCars getBrand() {
        return brand;
    }

    public void setBrand(BrandOfCars brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", regNumber=" + regNumber +
                '}';
    }
}
