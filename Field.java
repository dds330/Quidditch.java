public class Field {
    //instance variables to hold the field's data (x and y positions)
    private double xpos;
    private double ypos;
    private double length;
    private double width;

    //constructor
    public Field(double xpos, double ypos, double length, double width){
        this.xpos = xpos;
        this.ypos = ypos;
        this.length = length;
        this.width = width;
    }

    //getters
    public double getXpos(){return xpos;}
    public double getYpos(){return ypos;}
    public double getLength(){return length;}
    public double getWidth(){return width;}

    //setters
    public void setXpos(double xpos){this.xpos = xpos;}
    public void setYpos(double ypos){this.ypos = ypos;}
    public void setLength(double length){this.length = length;}
    public void setWidth(double width){this.width = width;}

    public String toString(){
        return "Field: [" + xpos + ", " + ypos + "] " + length + ", "+ width;
    }
}

