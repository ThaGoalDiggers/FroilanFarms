

public class Tractor extends Vehicle implements FarmVehicle {

    private boolean ismounted = false;

    public void operate(Farm farm) {

    }

    public String makeNoise() {
        return "Tractor noises";
    }

    public boolean ismounted() {
        return ismounted = true;
    }

    public boolean isNotMounted() {
        return ismounted = true;
    }

    public boolean isnotmounted() {
        return ismounted = false;
    }

    public void operate() {

    }
}
