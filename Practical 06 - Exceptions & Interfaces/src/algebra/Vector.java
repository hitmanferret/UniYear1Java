package algebra;

public class Vector{

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

    public double get(int index) throws InvalidDimensionException{
        if (index >= 0 && index <= _vector.length){
            return _vector[index];
        }else{
            throw new InvalidDimensionException("Index is out of bounds of the vector");
        }        
    }

    public double set(int index, double value) throws InvalidDimensionException{
        if (index >= 0 && index <= _vector.length){
        double old_value = _vector[index];
        _vector[index] = value;
        return old_value;
        }else{
            throw new InvalidDimensionException("Index is out of bounds of the vector");
        }
    }

    public Vector scalarProduct(double scalar){
        double[] new_vec = new double[_vector.length];
        for (int i = 0, n = _vector.length ; i < n ; i++){
            double new_value = _vector[i]*scalar;
            new_vec[i] = new_value;
        }
        Vector new_vector = new Vector(new_vec);
        return new_vector;
    }

    public Vector add(Vector Other) throws IncompatibleDimensionException{
        if (Other.Size() != _vector.length){
            throw new IncompatibleDimensionException("Vector sizes are not the same");
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