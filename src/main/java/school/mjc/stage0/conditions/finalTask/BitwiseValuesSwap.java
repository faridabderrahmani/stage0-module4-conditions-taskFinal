package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void main(String[] args) {

    }
    public  void swap(int first, int second) {
        first = first^second;
        second = first^second;
        first = first^second;
    }
}
