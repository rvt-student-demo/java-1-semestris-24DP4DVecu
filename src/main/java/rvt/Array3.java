package Array;

public class Array3 {
    public static void main (String[] args) {
        double[] val = new double[4];

        val[0] = 0.12;
        val[1] = 1.43;
        val[2] = 2.98;

        int j = 3;
        System.out.println( "cell 3: " + val[ j  ] );
        System.out.println( "cell 2: " + val[ j-1 ] );

        j = j-2;
        System.out.println( "cell 1: " + val[ j   ] );
    }
}
