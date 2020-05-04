public class Circle extends Shape{
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double rad){
        radius = rad;
    }

    public Circle(Point centr, double rad){
        super.setCentre(centr);
        radius = rad;
    }

    public Circle(Point centr, double r, String col, boolean filled){
        super.setCentre(centr);
        super.setColor(col);
        super.setFilled(filled);
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double Radius){
        radius = Radius;
    }

    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = Math.PI * (radius*2);
        return perimeter;
    }

    @Override
    public String toString(){
        return ("A Circle with radius = " + radius + " which is a subclass of " + super.toString());
    }

    @Override
    public boolean equals(Object other){
        Circle Other = (Circle) other;
        if (this.getRadius() == Other.getRadius() && this.getCentre().equals(Other.getCentre())){
            return true;
        }
        return false;
    }
}