package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void main(String[] args) {

    }
    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        if(dividend != 0){
            if (result * divider == dividend){
                System.out.println("can be divided completely");
            }else if (divider == 0){
                System.out.println("division by zero");
            }else{
                System.out.println("cannot be divided completely");
            }
        }else {
            System.out.println("cannot be divided completely");
        }
    }
}
