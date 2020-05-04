package tool.counter;

public class mainapp{

    public static void main(String args[]) throws InvalidOperationException {
        BasicTallyCounter test = new BasicTallyCounter(4);
        int n = 29;
        for (int i=0; i<n; i++){
            test.button1();
        }
        System.out.println(test);

        // String hi = "hi";
        // String bye = "bye";
        // String hibye = hi + bye;
        // System.out.println(hibye);
    }
}