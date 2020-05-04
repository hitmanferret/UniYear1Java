package algebra;

public class mainapp{
    public static void main(String[] args) throws IncompatibleDimensionException {
        double[] vec = {2.0, 4.0, 1.0};
        Vector vector = new Vector(vec);
        double[] vec2 = {2.0,1.0,2.0};
        Vector Vec2 = new Vector(vec2);
        System.out.println(vector);
        System.out.println(vector.Size());
        // System.out.println(vector.set(0,4.2));
        System.out.println(vector.scalarProduct(2));
        System.out.println(vector.add(Vec2));
    }
}