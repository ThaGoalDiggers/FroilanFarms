package lamarsabstract;

public class AirCraft extends  Vehicle {

    private String fly;

    public AirCraft (String fly){
        this.fly=fly;

    }


    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }


    public String makeNoise() {
        return null;
    }

    public boolean ismounted() {
        return false;
    }
}