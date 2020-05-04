package tool.counter;

public class BasicTallyCounter implements ITallyCounter{
    private int count;
    private int digits;
    private int max_count;

    public BasicTallyCounter(){
        digits = 3;
        max_count = (int) (Math.pow(10, digits))-1;
    }
    
    public BasicTallyCounter(int Digits){
        digits = Digits;
        max_count = (int) (Math.pow(10, digits))-1;
    }

    public void button1() throws InvalidOperationException {
        if (count <=max_count){
            count += 1;
        }else{
            throw new InvalidOperationException("Count has surpassed " + max_count + ", please reset");
        }
    }

    public void button2(){
        count = 0;
    }

    public int getCount(){
        return count;
    }

    public String toString(){
        int count_length = String.valueOf(count).length();
        int num_of_0s = digits - count_length;
        String output = "";
        for (int i=0; i<num_of_0s; i++){
            output += "0";
        }
        output += count;
        return output;
    }
}