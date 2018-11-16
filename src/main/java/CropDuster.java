

public class CropDuster extends AirCraft implements FarmVehicle {

    public boolean isMounted = false;

    public String fly() {
        return "flys around crops ";
    }

    public String makeNoise() {
        return "Plane noises";
    }

    public boolean ismounted() {
        return true;
    }

    public boolean isNotMounted() {
        return false ;
    }

    public void operate(Farm farm) {

    }

    public void operate() {
        System.out.println("operating");
    }

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }
}
