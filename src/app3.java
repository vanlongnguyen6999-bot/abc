public class app3 {
    public static void main(String args[]){
        Point p1 = new Point(3, 4);
        System.out.println(p1.toString());
        MovablePoint p2 = new MovablePoint(p1, 1, 2);
        System.out.println("Before move: " + p2.toString());
        p2.move();
        System.out.println("After move: " + p2.toString());
    }
}
