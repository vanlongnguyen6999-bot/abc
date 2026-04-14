public class Cylinder extends Circle{
    private double high;
    public double getV(){
        double radius  = getRadius();
        return high * Math.PI * radius * radius;
    }

    public Cylinder(double high) {
        this.high = high;
    }

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", high=" + high +
                '}';
    }
}
