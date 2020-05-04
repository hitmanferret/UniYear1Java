public class Square extends Rectangle{
    private double side;

    public Square(){
        side = 1.0;
    }

    public Square(Point centr, double Side){
        super.setCentre(centr);
        side = Side;
    }

    public Square(Point centr, double Side, String col, boolean filled){
        super.setCentre(centr);
        super.setColor(col);
        super.setFilled(filled);
        side = Side;
    }

    public String toString(){
        return ("A Square with side length = " + side + ", which is a subclass of " + super.toString());
    }

    @Override
    public double getPerimeter(){
        double perimeter = side*4;
        return perimeter;
    }

    @Override
    public double getArea(){
        double area = side*side;
        return area;
    }

    @Override
    public void setLength(double Length){
        side = Length;
        super.setLength(Length);
        super.setWidth(Length);
    }

    @Override
    public void setWidth(double Width){
        side = Width;
        super.setWidth(Width);
        super.setLength(Width);
    }

    @Override
    public boolean equals(Object other){
        Square Other = (Square) other;
        if (this.getArea() == Other.getArea() && this.getCentre().equals(Other.getCentre())){
            return true;
        }
        return false;
    }
}