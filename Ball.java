public class Ball {
    //instance variables to hold the original position of the ball
    private double bx;
    private double by;

    //constructor
    public Ball(double bx, double by){
        this.bx = bx;
        this.by = by;
    }

    //getters
    public double getBx(){return bx;}
    public double getBy(){return by;}

    //setters
    public void setBx(double bx){this.bx = bx;}
    public void setBy(double by){this.by = by;}

    //toString method
    public String toString(){
        return "Ball is at (" + bx + ", " + by + ")";
    }
}
