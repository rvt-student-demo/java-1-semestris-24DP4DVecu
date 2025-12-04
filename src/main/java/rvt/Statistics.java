package rvt;

public class Statistics {

    private int count;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count++;   // we only count how many numbers were added
    }

    public int getCount() {
        // write code here
        return this.count;
    }
}