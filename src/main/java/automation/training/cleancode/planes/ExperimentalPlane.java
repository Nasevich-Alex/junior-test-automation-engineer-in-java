package automation.training.cleancode.planes;

import automation.training.cleancode.models.*;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private final ExperimentalTypes experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }
    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExperimentalPlane)) return false;
        if (!super.equals(o)) return false;
        ExperimentalPlane experimentalPlane = (ExperimentalPlane) o;
        return experimentalType == experimentalPlane.experimentalType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalType, classificationLevel);
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + super.getModel() + '\'' +
                '}';
    }
}
