public abstract class Shape implements Movable{
    private String color;
    private Boolean filled;
    private Point centre;

    public Shape(){
        color = "red";
        filled = true;
        centre = new Point(0,0);
    }
    
    public Shape(String Color, Boolean Filled){
        color = Color;
        filled = Filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String Color){
        color = Color;
    }

    public Boolean isFilled(){
        return filled;
    }

    public void setFilled(Boolean Filled){
        filled = Filled;
    }

    public String toString(){
        return ("A Shape with color " + color + " and filled = " + filled);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void setCentre(Point point){
        centre = point;
    }
 
    public Point getCentre(){
         return centre;
    }

    public Point moveTo(Point centr){
        centre = centr;
        return centre;
    }

    public abstract boolean equals(Object other);
}