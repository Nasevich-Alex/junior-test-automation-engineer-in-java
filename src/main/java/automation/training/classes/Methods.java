package automation.training.classes;

import java.util.ArrayList;

public class Methods {
    public ArrayList<Car> chooseByBrand (ArrayList<Car> cars, BrandOfCars brand) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car carX : cars) {
            if (carX.getBrand().equals(brand))
                result.add(carX);
        }
        return result;
    }

    public ArrayList<Car> chooseByModelAndYear (ArrayList<Car> cars, String model, int yearRightNow, int yearLimit) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car carX : cars) {
            if (carX.getModel().equals(model) && (yearRightNow - carX.getYearOfIssue()) > yearLimit) {
                result.add(carX);
            }
        }
        return result;
    }

    public ArrayList<Car> chooseByYearAndPrice (ArrayList<Car> cars, int yearOfIssue, int price) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car carX : cars) {
            if (carX.getYearOfIssue() == yearOfIssue && carX.getPrice() > price) {
                result.add(carX);
            }
        }
        return result;
    }
}
