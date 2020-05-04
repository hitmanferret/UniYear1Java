public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double wid, double len){
        width = wid;
        length = len;
    }

    public Rectangle(Point centr, double wid, double len){
        super.setCentre(centr);
        width = wid;
        length = len;
    }

    public Rectangle(Point c, double w, double l, String col, boolean filled){
        super.setCentre(c);
        super.setColor(col);
        super.setFilled(filled);
        width = w;
        length = l;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double Width){
        width = Width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double Length){
        length = Length;
    }

    public double getArea(){
        double area = length * width;
        return (area);
    }

    public double getPerimeter(){
        double perimeter = (length*2) + (width*2);
        return perimeter;
    }

    @Override
    public String toString(){
        if (width == length){
            return ("A Rectangle with side length = " + length + " which is a subclass of " + super.toString());
        }else{
            return ("A Rectangle with width = " + width + " and length = " + length + " which is a subclass of " + super.toString());
        }
    }

    @Override
    public boolean equals(Object other){
        Rectangle Other = (Rectangle) other;
        if (this.getWidth() == Other.getWidth() && this.getCentre().equals(Other.getCentre()) && this.getLength() == Other.getLength()){
            return true;
        }
        return false;
    }
}