public class MovablePoint extends Point{
    private float xspeed = 0.0f;
    private float yspeed = 0.0f;

    public MovablePoint(float xspeed, float yspeed) {
        super();
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public MovablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public MovablePoint(Point p, float xspeed, float yspeed){
        super(p.getX(), p.getY());
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }
    public MovablePoint() {
    }

    public float getXSpeed() {
        return xspeed;
    }

    public void setXSpeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public float getYSpeed() {
        return yspeed;
    }

    public void setYSpeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public float[] getSpeed(){
        return new float[]{xspeed, yspeed};
    }

    public void setSpeed(float xspeed, float yspeed){
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", speed = (" + xspeed + ", " + yspeed + ")";
    }

    public MovablePoint move(){
        setX(getX() + xspeed);
        setY(getY() + yspeed);
        return this;
    }
}
