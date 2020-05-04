public class Vector{

    public static void main(String[] args){
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

    private double[] _vector; 
    public Vector(double[] input){
        _vector = input;
    }

    public String toString(){
        String output = "[";
        for (int i = 0, n = _vector.length ; i < n ; i++){
            if (i == n-1){
                output += _vector[i] + "]";
            }else{
                output += _vector[i] + ", ";
            }
        }
        return (output);
    }

    public int Size(){
        int size = _vector.length;
        return size;
    }

    public double get(int index){
        return _vector[index];
    }

    public double set(int index, double value){
        double old_value = _vector[index];
        _vector[index] = value;
        return old_value;
    }

    public Vector scalarProduct(double scalar){
        double[] new_vec = new double[_vector.length];
        Vector new_vector = new Vector(new_vec);
        for (int i = 0, n = _vector.length ; i < n ; i++){
            double new_value = _vector[i]*scalar;
            new_vec[i] = new_value;
        }
        return new_vector;
    }

    public Vector add(Vector Other){
        if (Other.Size() != _vector.length){
            return null;
        }else{
            double[] new_vec = new double[_vector.length];
            // Vector new_vector = new Vector(new_vec);
            for (int i = 0, n = _vector.length ; i < n ; i++){
                double new_value = _vector[i] + Other._vector[i];
                new_vec[i] = new_value;
            }
            Vector new_Vector = new Vector(new_vec);
            return new_Vector;
        }
    }
}