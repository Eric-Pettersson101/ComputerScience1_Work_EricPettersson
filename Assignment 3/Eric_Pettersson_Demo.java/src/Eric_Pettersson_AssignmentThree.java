public class Eric_Pettersson_AssignmentThree {
    private double distance;

    // Getter and setter
    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    // Calculating speeds
    public double getSpeedInAir() {
        return this.distance / 1100;
    }

    public double getSpeedInWater() {
        return this.distance / 4900;
    }

    public double getSpeedInSteel() {
        return this.distance / 16400;
    }
}