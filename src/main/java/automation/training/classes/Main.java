package automation.training.classes;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(BrandOfCars.BMW, "X6", 2010, 25000, 4579, "Red", 1);
        Car car2 = new Car(BrandOfCars.RENAULT, "Megane", 1999, 5000, 8647, "Blue", 1);
        Car car3 = new Car(BrandOfCars.FORD, "F350", 2005, 14000, 5267, "Black", 3);
        Car car4 = new Car(BrandOfCars.TOYOTA, "Prius", 2018, 19000);
        Car car5 = new Car(BrandOfCars.BMW, "E39", 1995, 7000, 6972, "White",5);
        Car car6 = new Car(BrandOfCars.VOLVO, "XC90", 2001, 12000);
        Car car7 = new Car(BrandOfCars.RENAULT, "Clio", 2006, 4500, 9634, "Black", 7);
        Car car8 = new Car(BrandOfCars.MERCEDES, "Sprinter", 1998, 10000, 4125, "Red", 8);
        Car car9 = new Car(BrandOfCars.CITROEN, "Xantia", 2007, 7500);
        Car car10 = new Car(BrandOfCars.KIA, "Rio", 2019, 11000, 1298, "Orange", 10);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

        Methods methods = new Methods();
        System.out.println("Вывести список автомобилей марки Renault");
        ArrayList<Car> number1 = methods.chooseByBrand(cars, BrandOfCars.RENAULT);
        for (Car carX : number1) {
            System.out.println(carX.toString());
        }

        System.out.println("____________________________________________________________________");
        System.out.println("Вывести список автомобилей модели \"Sprinter\", которые эксплуатируются больше 10 лет");
        ArrayList<Car> number2 = methods.chooseByModelAndYear(cars, "Sprinter", 2020, 10);
        for (Car carX : number2) {
            System.out.println(carX.toString());
        }

        System.out.println("_______________________________________________________________________");
        System.out.println("Вывести список автомобилей 2005 года выпуска, цена которых больше 5000");
        ArrayList<Car> number3 = methods.chooseByYearAndPrice(cars, 2005, 5000);
        for (Car carX : number3) {
            System.out.println(carX.toString());
        }
    }
}
