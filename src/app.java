public class app {
    public static void main(String args[]){
        Circle c = new Circle(3.2, "red");
        Cylinder t = new Cylinder(3.2, "red", 1.3);
        System.out.println("Chu vi hình tròn: " + c.getC());
        System.out.println("Diện tích hình tròn: " + c.getS());
        System.out.println("Thể tích hình trụ: " + t.getV());
    }
}
