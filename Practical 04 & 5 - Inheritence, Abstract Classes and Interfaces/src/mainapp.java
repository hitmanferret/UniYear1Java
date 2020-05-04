public class mainapp{
    public static void main(String[] args){

        // //tests for circle stuff
        // Circle testshape = new Circle();
        // testshape.setColor("Orange");
        // testshape.setFilled(false);
        // testshape.setRadius(2.7);
        // System.out.println(testshape);
        // System.out.println(testshape.getArea());
        // System.out.println(testshape.getPerimeter());

        //tests for rectangle stuff
        // Square testshape = new Square();
        // testshape.setColor("Green");
        // testshape.setFilled(false);
        // testshape.setLength(2.8);
        // testshape.setWidth(0.5);
        // System.out.println(testshape);
        // System.out.println(testshape.getPerimeter());
        // System.out.println(testshape.getArea());

        // Point test = new Point(5,8);
        // Point test2 = new Point(5,9);
        // System.out.println(test.equals(test2));

        // Rectangle test = new Rectangle(1,3);
        // Rectangle test2 = new Rectangle(3,1);
        // System.out.println(test.equals(test2));

        Point start = new Point(1,1);
        Point end = new Point(1,10);
        Line test = new Line(start, end);
        // System.out.println(test);
        System.out.println(test.getCentre());
    }
}