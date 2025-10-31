package Array;

public class Array2 {
    public static void main(String[] args) {
        int values[] = new int[7];
        int index;

        values[ 6 ] = 42;

        index = 0;
        values[ index ] = 71;

        index = 5;
        values[ index ] = 23;

        index = 3;
        values[ 2+2 ] = values[ index-3 ]; // same as values[ 4 ] = values [ 0 ];

        System.out.println(values[6]);
    }
}
