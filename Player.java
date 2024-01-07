public class Player {
    private String name;
    //to check if the ball is reflected or not
    private boolean reflected;

    public Player(String name){
        this.name = name;
        reflected = false;
    }

    //returns true if the ball is reflected, false otherwise
    public boolean isReflected(){return reflected;}

    public String toString(){
        return "Player " + name;
    }

    public void kick(Field f, Ball b, double d, double r){

        //creating necessary variables for new position calculation
        double nx,ny, r_radians, cosValue, sinValue;
        r_radians = Math.toRadians(r);
        cosValue = Math.cos(r_radians);
        sinValue = Math.sin(r_radians);

        //potential x and y positions after kicking
        nx = b.getBx() + d * cosValue;
        ny = b.getBy() + d * sinValue;

        //if the new position is inside the field
        //if new x pos is in the field
        if(nx <= (f.getXpos() + f.getLength()) && nx >= f.getXpos()){
            //if new y pos is in the field --> ball is in the field
            if(ny >= f.getYpos() && ny <= (f.getYpos() + f.getWidth())){
                b.setBx(nx);
                b.setBy(ny);
            }
            //x pos is in field but y pos takes it out of the field
            //ball is reflected
            else{
                b.setBx(nx);
                reflected = true;
            }
        }
        //if new y value is in the field but new x is outside
        //ball is reflected
        else if(ny >= f.getYpos() && ny <= (f.getYpos() + f.getWidth())){
            b.setBy(ny);
            reflected = true;
        }

        //else if both values take it outside then don't change either values
        //ball is reflected to original position
        else{
            reflected = true;
        }
    }
}
